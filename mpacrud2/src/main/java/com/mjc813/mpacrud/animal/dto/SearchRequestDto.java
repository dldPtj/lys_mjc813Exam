package com.mjc813.mpacrud.animal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequestDto {
    private String searchType;
    private String searchWord;
    private Integer offset; // null이 들어오면 0으로 처리하기 위해 Integer로 선언
    private Integer rowsOnePage;
    private Integer page;

    public Integer getOffset() {
        return (this.getPage()-1) * this.getPage();
    };
}
