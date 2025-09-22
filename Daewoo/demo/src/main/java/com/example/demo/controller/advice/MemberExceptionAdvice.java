package com.example.demo.controller.advice;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.CommonExceptionTemplate;

@RestControllerAdvice
public class MemberExceptionAdvice {

    @ExceptionHandler(CommonExceptionTemplate.class)
    public ResponseEntity<Map<String, Object>> handlerMemberException(CommonExceptionTemplate ex) {
        int code = ex.getCode();
        String message = ex.getMessage();

        return ResponseEntity.badRequest().body(Map.of("code", code, "message", message));
    }

}
