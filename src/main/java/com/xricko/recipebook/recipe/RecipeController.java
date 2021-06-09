package com.xricko.recipebook.recipe;

import com.xricko.recipebook.shared.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/recipes")
public class RecipeController extends ControllerBase<Recipe, RecipeService> {

    @Autowired
    public RecipeController(RecipeService recipeService) {
        super(recipeService);
    }

    @GetMapping("getByIngredientId/{ingredientId}")
    public List<Recipe> getByIngredient(@PathVariable int ingredientId) {
        return service.getByIngredient(ingredientId);
    }
}
