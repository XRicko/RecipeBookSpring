package com.xricko.recipebook.category;

import com.xricko.recipebook.shared.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends ServiceBase<Category, CategoryRepository> {

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        super(categoryRepository);
    }
}
