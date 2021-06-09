package com.xricko.recipebook.recipeIngredient;

import com.xricko.recipebook.shared.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/recipeIngredients")
public class RecipeIngredientController extends ControllerBase<RecipeIngredient, RecipeIngredientService> {

    @Autowired
    public RecipeIngredientController(RecipeIngredientService recipeIngredientService) {
        super(recipeIngredientService);
    }
}
