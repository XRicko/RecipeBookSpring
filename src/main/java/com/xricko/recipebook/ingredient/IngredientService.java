package com.xricko.recipebook.ingredient;

import com.xricko.recipebook.shared.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService extends ServiceBase<Ingredient, IngredientRepository> {

    @Autowired
    public IngredientService(IngredientRepository repository) {
        super(repository);
    }
}
