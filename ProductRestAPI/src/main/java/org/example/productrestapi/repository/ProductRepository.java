package org.example.productrestapi.repository;

import org.example.productrestapi.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    public List<Product> findAllProduct();
    public Optional<Product> findById(Long id);
    public void save(Product product);
    public void update(Long id, Product product);
    public void delete(Long id);
}