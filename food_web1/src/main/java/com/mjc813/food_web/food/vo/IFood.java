package com.mjc813.food_web.food.vo;

import jakarta.persistence.Column;

public interface IFood {
    public Long getId();
    public void setId(final Long id);

    public String getName();
    public void setName(final String name);

    public Integer getSpicyLevel();
    public void setSpicyLevel(final Integer spicyLevel);

    public Integer getSweetLevel();
    public void setSweetLevel(final Integer sweetLevel);

    public Integer getSourLevel();
    public void setSourLevel(final Integer sourLevel);

    public Integer getSaltyLevel();
    public void setSaltyLevel(final Integer saltyLevel);

    public Long getIngredient_id();
    public void setIngredient_id(final Long ingredient_id);

    public Long getFood_category_id();
    public void setFood_category_id(final Long food_category_id);
}
