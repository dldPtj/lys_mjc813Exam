package com.mjc813.swimcrud.swim;

import com.mjc813.swimcrud.common.ResponseCode;
import com.mjc813.swimcrud.common.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/swim")
public class SwimRestController {
    @Autowired
    private SwimService swimService;

    @GetMapping("/list")
    public ResponseEntity<ResponseDto> loadData() {
        try {
            List<SwimDto> arraylist = this.swimService.findAll();
            return ResponseEntity.ok(this.getResponseDto(ResponseCode.SUCCESS, "ok", arraylist));
        } catch (Throwable e) {
            log.error(e.toString());
            return ResponseEntity.status(500).body(this.getResponseDto(ResponseCode.SELECT_FAIL, "error", null));
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<ResponseDto> insertSwim(@RequestBody SwimDto swimDto) {
        try {
            this.swimService.addSwim(swimDto);
            return ResponseEntity.ok(this.getResponseDto(ResponseCode.SUCCESS, "ok", swimDto));
        } catch (Exception e) {
            log.error(e.toString());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ResponseDto());
        }
    }

    private ResponseDto getResponseDto(ResponseCode responseCode, String message, Object data) {
        return ResponseDto.builder()
                .code(responseCode)
                .message(message)
                .responseData(data)
                .build();
    }
}
