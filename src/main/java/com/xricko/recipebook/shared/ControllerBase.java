package com.xricko.recipebook.shared;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public abstract class ControllerBase<TEntity extends BaseEntity, TService extends GenericService<TEntity>>
        implements GenericController<TEntity>{
    protected final TService service;

    @Autowired
    public ControllerBase(TService tService) {
        service = tService;
    }

    @Override
    public List<TEntity> getItems() {
        return service.getItems();
    }

    @Override
    public Optional<TEntity> getItem(int id) {
        return service.getItemById(id);
    }

    @Override
    public void addItem(TEntity entity) {
        service.addItem(entity);
    }

    @Override
    public void updateItem(TEntity entity) {
        service.updateItem(entity);
    }

    @Override
    public void deleteItem(int id) {
        service.deleteItem(id);
    }
}
