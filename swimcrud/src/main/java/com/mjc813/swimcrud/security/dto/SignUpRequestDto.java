package com.mjc813.swimcrud.security.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mjc813.swimcrud.member.dto.Erole;
import com.mjc813.swimcrud.member.dto.IMember;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpRequestDto implements IMember {
    @JsonIgnore
    private Long id;
    private Erole role;

    @Size(min = 2, max = 20)
    private String name;

    @Size(min = 2, max = 20)
    private String username;

    @Size(min = 2, max = 20)
    private String password;

    @Size(min = 2, max = 50)
    @Email
    private String email;

    @Size(min = 2, max = 15)
    private String phoneNumber;

    @Size(min = 0, max = 5)
    private Integer maxLock;
}
