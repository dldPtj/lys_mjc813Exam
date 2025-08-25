package com.mjc813.food_web.ingredient_category.controller;

import com.mjc813.food_web.common.CommonRestController;
import com.mjc813.food_web.common.IIdName;
import com.mjc813.food_web.common.ResponseCode;
import com.mjc813.food_web.common.ResponseDto;
import com.mjc813.food_web.ingredient_category.dto.IngredientCategoryDto;
import com.mjc813.food_web.ingredient_category.service.IngredientCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/ingredient_category")
public class IngredientCategoryRestController extends CommonRestController {
    @Autowired
    private IngredientCategoryService IngredientCategoryService;

    @PostMapping("")
    public ResponseEntity<ResponseDto> insert(
            @Validated @RequestBody IngredientCategoryDto dto
    ) {
        try {
            IIdName iIdName = this.IngredientCategoryService.insertRepository(dto);
//            IIdName iIdName = this.IngredientCategoryService.insertMybatis(dto);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", iIdName, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.INSERT_FAIL, "Error", dto, th);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ResponseDto> update(
            @PathVariable Long id
            , @Validated @RequestBody IngredientCategoryDto dto
    ) {
        try {
            IIdName iIdName = this.IngredientCategoryService.updateRepository(dto);
//            IIdName iIdName = this.IngredientCategoryService.updateMybatis(dto);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", iIdName, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.UPDATE_FAIL, "Error", dto, th);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(
            @PathVariable Long id
    ) {
        try {
            Boolean bResult = this.IngredientCategoryService.deleteRepository(id);
//            Boolean bResult = this.IngredientCategoryService.deleteMybatis(id);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", bResult, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.DELETE_FAIL, "Error", id, th);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable Long id) {
        try {
            IIdName find = this.IngredientCategoryService.findByIdRepository(id);
//            IIdName find = this.IngredientCategoryService.findByIdMybatis(id);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", find, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.SELECT_FAIL, "Error", id, th);
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findAll() {
        try {
            List<IIdName> all = this.IngredientCategoryService.findAllRepository();
//            List<IIdName> all = this.IngredientCategoryService.findAllMybatis(id);
            return this.getReponseEntity(ResponseCode.SUCCESS, "OK", all, null);
        } catch (Throwable th) {
            log.error(th.toString());
            return this.getReponseEntity(ResponseCode.SELECT_FAIL, "Error", null, th);
        }
    }

}
