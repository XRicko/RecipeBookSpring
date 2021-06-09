package com.xricko.recipebook.shared;

import java.util.List;
import java.util.Optional;

public interface GenericService<TEntity extends BaseEntity> {
    List<TEntity> getItems();
    Optional<TEntity> getItemById(int id);

    void addItem(TEntity entity);
    void updateItem(TEntity entity);
    void deleteItem(int id);
}
