package com.xricko.recipebook.recipeIngredient;

import com.xricko.recipebook.shared.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeIngredientService extends ServiceBase<RecipeIngredient, RecipeIngredientRepository> {

    @Autowired
    public RecipeIngredientService(RecipeIngredientRepository recipeIngredientRepository) {
        super(recipeIngredientRepository);
    }
}
