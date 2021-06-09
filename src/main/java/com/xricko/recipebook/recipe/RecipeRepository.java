package com.xricko.recipebook.recipe;

import com.xricko.recipebook.shared.GenericRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends GenericRepository<Recipe> {
    List<Recipe> findByRecipeIngredientsIngredientId(int id);
}
