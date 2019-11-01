package com.codegym.service.impl;

import com.codegym.model.TypeProduct;
import com.codegym.repository.TypeProductRepository;
import com.codegym.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class TypeProductServiceImpl implements TypeProductService {

    @Autowired
    private TypeProductRepository typeProductRepository;

    @Override
    public Page<TypeProduct> findAll(Pageable pageable) {
        return typeProductRepository.findAll(pageable);
    }

    @Override
    public TypeProduct findById(Long id) {
        return typeProductRepository.findOne(id);
    }

    @Override
    public void save(TypeProduct typeProduct) {
        typeProductRepository.save(typeProduct);
    }

    @Override
    public void remove(Long id) {
        typeProductRepository.delete(id);
    }
}
