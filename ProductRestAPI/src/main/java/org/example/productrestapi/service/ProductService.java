package org.example.productrestapi.service;

import org.example.productrestapi.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Optional<Product> findById(Long id);
    public List<Product> findAllProduct();
    public List<Product> findAllProductsSortedByName(String column);
    public List<Product> findProductsByPriceGreaterThan(double price);
    public List<Product> findProductsByPriceLessThan(double price);
    public List<Product> findProductsByPartOfName(String name);
    public void save(Product product);
    public void update(Long id, Product product);
    public void delete(Long id);
}
