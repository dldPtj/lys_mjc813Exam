package com.mjc813.start_spring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact implements IContact{
    private Long id;
    private String name;
    private String phoneNumber;
    private String zipNumber;
    private String email;
}
