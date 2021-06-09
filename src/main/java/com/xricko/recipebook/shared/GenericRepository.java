package com.xricko.recipebook.shared;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface GenericRepository<TEntity extends BaseEntity>
        extends JpaRepository<TEntity, Integer> {
    Optional<TEntity> findByName(String name);
}
