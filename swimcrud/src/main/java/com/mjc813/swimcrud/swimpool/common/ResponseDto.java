package com.mjc813.swimcrud.swimpool.common;

import com.mjc813.swimcrud.swimpool.common.ResponseEnum;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDto { // fiddler 에서 보이는 리턴값
    // http 요청에 대한 응답을 설계한 데이터형
    private ResponseEnum responseEnum; // Code 처럼 사용할 응답
    private String message; // 출력할 응답 문자열
    private Object responseData; // 출력할 응답 객체 멤버변수
}
