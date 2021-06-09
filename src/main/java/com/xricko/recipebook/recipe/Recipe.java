package com.xricko.recipebook.recipe;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.xricko.recipebook.category.Category;
import com.xricko.recipebook.recipeIngredient.RecipeIngredient;
import com.xricko.recipebook.shared.BaseEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Recipe extends BaseEntity {
    @Getter
    private String description;

    @Getter
    private String instruction;

    @Getter
    private Double durationInMinutes;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @Getter
    private Category category;

    @JsonIgnore
    @OneToMany(mappedBy = "recipe")
    @Getter
    private final Set<RecipeIngredient> recipeIngredients = new HashSet<>();
}
