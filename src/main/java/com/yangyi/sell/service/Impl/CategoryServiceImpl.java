package com.yangyi.sell.service.Impl;

import com.yangyi.sell.dataobject.ProductCategory;
import com.yangyi.sell.repository.ProductCategoryRepository;
import com.yangyi.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategoryRepository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory sava(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }
}
