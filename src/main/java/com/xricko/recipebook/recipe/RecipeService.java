package com.xricko.recipebook.recipe;

import com.xricko.recipebook.shared.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService extends ServiceBase<Recipe, RecipeRepository> {

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        super(recipeRepository);
    }

    public List<Recipe> getByIngredient(int id) {
        return repository.findByRecipeIngredientsIngredientId(id);
    }
}
