package com.mjc813.food_web.food.vo;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "CategoryEntity")
@Table(name = "food_category_tbl")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "ingredient_category_id")
    private String name;
}
