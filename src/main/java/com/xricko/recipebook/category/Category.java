package com.xricko.recipebook.category;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.xricko.recipebook.recipe.Recipe;
import com.xricko.recipebook.shared.BaseEntity;
import lombok.Getter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Category extends BaseEntity {
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    @JoinColumn(name = "parentId")
    @Getter
    private Category parent;

    @JsonIgnore
    @OneToMany(mappedBy = "parent")
    @Getter
    private final Set<Category> children = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    @Getter
    private final Set<Recipe> recipes = new HashSet<>();
}
