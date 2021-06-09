package com.xricko.recipebook.ingredient;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xricko.recipebook.recipeIngredient.RecipeIngredient;
import com.xricko.recipebook.shared.BaseEntity;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@JsonIdentityReference(alwaysAsId = true)
public class Ingredient extends BaseEntity {
    @JsonIgnore
    @OneToMany(mappedBy = "ingredient")
    @Getter
    private final Set<RecipeIngredient> recipeIngredients = new HashSet<>();
}
