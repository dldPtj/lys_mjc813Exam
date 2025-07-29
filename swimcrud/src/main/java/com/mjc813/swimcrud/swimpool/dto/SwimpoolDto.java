package com.mjc813.swimcrud.swimpool.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SwimpoolDto { // Dto를 가지고 데이터가 전달될 예정
    // 화면마다 입력이 달라질 경우 RequestDto와 ResponseDto를 구분해서 만드는 경우도 있다.
    private Integer id;
    private String name;
    private Integer lanes;
    private Integer lane_type;
    private String phone_number;
    private String addr;
}
