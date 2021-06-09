package com.xricko.recipebook.category;

import com.xricko.recipebook.shared.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
public class CategoryController extends ControllerBase<Category, CategoryService> {

    @Autowired
    public CategoryController(CategoryService categoryService) {
        super(categoryService);
    }
}
