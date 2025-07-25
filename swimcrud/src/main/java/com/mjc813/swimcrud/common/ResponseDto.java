package com.mjc813.swimcrud.common;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto {
    private ResponseCode code;
    private String message;
    private Object responseData;
}
