package com.xricko.recipebook.recipeIngredient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.xricko.recipebook.ingredient.Ingredient;
import com.xricko.recipebook.recipe.Recipe;
import com.xricko.recipebook.shared.BaseEntity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@AttributeOverride(name = "name", column = @Column(name = "amount"))
public class RecipeIngredient extends BaseEntity {
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    @JoinColumn(name = "recipeId")
    @Getter
    private Recipe recipe;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    @JoinColumn(name = "ingredientId")
    @Getter
    private Ingredient ingredient;
}
