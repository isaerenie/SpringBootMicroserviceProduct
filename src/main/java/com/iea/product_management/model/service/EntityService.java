package com.iea.product_management.model.service;

import com.iea.product_management.model.entity.Product;

import java.util.List;

public interface EntityService<E, I>
{
    E findByID(I id);

    List<E> getAll();

    E save(E entity);

    void deleteByID(I id);
}
