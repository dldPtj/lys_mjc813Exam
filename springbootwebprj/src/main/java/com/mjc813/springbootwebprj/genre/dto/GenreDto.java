package com.mjc813.springbootwebprj.genre.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GenreDto implements IGenre{
    private Long id;
    private String name;
}
