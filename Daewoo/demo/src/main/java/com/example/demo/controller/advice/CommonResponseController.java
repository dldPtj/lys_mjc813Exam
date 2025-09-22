package com.example.demo.controller.advice;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.Appinfo;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.example.demo.util.ApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestControllerAdvice
public class CommonResponseController implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
            Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        if (body instanceof ApiResponse) {
            return body;
        }

        // Handle String specially (Spring uses StringHttpMessageConverter)
        if (body instanceof String) {
            try {
                return new ObjectMapper().writeValueAsString(ApiResponse.success(200, "success", body));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

        return ApiResponse.success(200, "success", body);
    }

}

