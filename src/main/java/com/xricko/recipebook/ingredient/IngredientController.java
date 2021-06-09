package com.xricko.recipebook.ingredient;

import com.xricko.recipebook.shared.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ingredients")
public class IngredientController extends ControllerBase<Ingredient, IngredientService> {

    @Autowired
    public IngredientController(IngredientService service) {
        super(service);
    }
}
