package com.mjc813.food_web.food.vo;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "IngrEntity")
@Table(name = "ingredient_tbl")
public class IngrEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private FoodEntity name;

    @ManyToOne
    @JoinColumn(name = "ingredient_category_id")
    private CategoryEntity ingredient_category_id;
}
