package com.mjc813.food_web.food.vo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "FoodEntity")
@Table(name = "food_tbl")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
    private String name;

    private Integer spicyLevel;

	private Integer sweetLevel;

    private Integer sourLevel;

    private Integer saltyLevel;

    private Long ingredient_id;

    private Long food_category_id;
}
