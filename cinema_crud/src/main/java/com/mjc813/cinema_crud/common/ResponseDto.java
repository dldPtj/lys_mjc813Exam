package com.mjc813.cinema_crud.common;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto {
    private Object result;
    private String message;
    private Object resultCode;
}
