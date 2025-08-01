package com.mjc813.cinema_crud.genre.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenreDto {
    private Long id;
    private String name;
}
