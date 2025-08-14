package com.mjc813.springbootwebprj.common;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto {
    private ResponseEnum resultCode;
    private String message;
    private Object resultData;
}
