package com.mjc813.swimcrud.swim;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwimDto {
    private Long id;
    private String name;
    private Integer lanes;
    private Integer lane_type;
    private String phone_number;
    private String addr;
}
