package com.mjc813.swimcrud.member.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity ( name = "MemberEntity" )
@Table ( name = "member_tbl" )
public class MemberEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(nullable = false, length = 200)
    private String name;

    @Column(nullable = false, length = 20, unique = true)
    private String username;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = true, length = 200)
    private String phoneNumber;

    @Column(nullable = false, length = 20)
    private Erole role;

    @Column(nullable = true)
    private Integer maxLock;
}
