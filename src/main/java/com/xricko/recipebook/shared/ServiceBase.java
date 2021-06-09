package com.xricko.recipebook.shared;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class ServiceBase<TEntity extends BaseEntity, TRepo extends GenericRepository<TEntity>>
        implements GenericService<TEntity> {
    protected final TRepo repository;

    @Autowired
    public ServiceBase(TRepo repo) {
        repository = repo;
    }

    @Override
    public List<TEntity> getItems() {
        return repository.findAll();
    }

    @Override
    public Optional<TEntity> getItemById(int id) {
        return repository.findById(id);
    }

    @Override
    public void addItem(TEntity entity) {
        var item = repository.findByName(entity.getName());

        if (item.isEmpty())
            repository.save(entity);
    }

    @Override
    public void deleteItem(int id) {
        repository.deleteById(id);
    }

    @Override
    public void updateItem(TEntity entity) {
        var item = repository.findById(entity.getId());

        if (item.isEmpty())
            throw new IllegalArgumentException();

        repository.save(entity);
    }
}
