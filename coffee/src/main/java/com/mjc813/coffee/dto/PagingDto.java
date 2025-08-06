package com.mjc813.coffee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PagingDto {
    private Integer page;
    private Integer rws;
    private Integer off;
    private Integer totRows;
    private Integer totPage;

    public Integer getPage() {
        return this.page == null || this.page <= 0 ? 1 : this.page;
    }

    public Integer getRws() {
        return this.rws == null ? 2 : this.rws;
    }

    public Integer getOff() {
        return (this.getPage() - 1) * this.getRws();
    }

    public Integer getTotPage() {
        return Integer.parseInt(
                String.format("%d", (this.getTotRows() + this.getRws() - 1) / (Long)Long.parseLong(this.getRws().toString()))
        );
    }
}
