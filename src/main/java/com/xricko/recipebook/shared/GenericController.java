package com.xricko.recipebook.shared;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface GenericController<TEntity extends BaseEntity> {
    @GetMapping
    List<TEntity> getItems();

    @GetMapping("{id}")
    Optional<TEntity> getItem(@PathVariable int id);

    @PostMapping
    void addItem(@RequestBody TEntity entity);

    @PutMapping
    void updateItem(@RequestBody TEntity entity);

    @DeleteMapping("{id}")
    void deleteItem(@PathVariable int id);
}
