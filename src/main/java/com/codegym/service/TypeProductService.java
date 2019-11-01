package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.model.TypeProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeProductService {

    Page<TypeProduct> findAll(Pageable pageable);

    TypeProduct findById(Long id);

    void save(TypeProduct typeProduct);

    void remove(Long id);
}
