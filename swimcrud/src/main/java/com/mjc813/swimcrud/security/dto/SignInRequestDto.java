package com.mjc813.swimcrud.security.dto;

import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignInRequestDto {
    @Size(min = 2, max = 20)
    private String username;

    @Size(min = 2, max = 20)
    private String password;
}
