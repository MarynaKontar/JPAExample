package com.app.dao;

import com.app.model.Animal;

/**
 * Created by denys on 6/20/2017.
 */
public interface DAO<T> {

    void save(T entity);

    void find(T entity);

    void merge(T entity);
}
