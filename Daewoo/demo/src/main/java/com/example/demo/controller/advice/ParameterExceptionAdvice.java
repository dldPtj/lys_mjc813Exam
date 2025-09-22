package com.example.demo.controller.advice;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ParameterExceptionAdvice {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<Map<String, Object>> handlerMemberException(MissingServletRequestParameterException ex) {
        String message = ex.getMessage();

        return ResponseEntity.badRequest().body(Map.of("message", message));
    }
}
