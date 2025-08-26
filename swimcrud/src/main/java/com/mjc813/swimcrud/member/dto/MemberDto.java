package com.mjc813.swimcrud.member.dto;

import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {
    private Long id;

    @Size(min = 2, max = 20)
    private String name;

    @Size(min = 2, max = 20)
    private String username;

    @Size(min = 2, max = 20)
    private String password;

    @Size(min = 2, max = 50)
    private String email;

    @Size(min = 2, max = 15)
    private String phoneNumber;

    private Erole role;

    @Size(min = 0, max = 5)
    private Integer maxLock;
}
