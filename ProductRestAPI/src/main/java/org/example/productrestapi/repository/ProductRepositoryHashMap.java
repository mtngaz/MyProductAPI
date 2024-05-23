package org.example.productrestapi.repository;

import org.example.productrestapi.entity.Product;
import org.example.productrestapi.exception.ProductNotSuchException;
import org.example.productrestapi.validation.ProductValidator;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryHashMap implements ProductRepository{
    private final HashMap<Long, Product> productHashMap;
    private long id;

    public ProductRepositoryHashMap() {
        productHashMap = new HashMap<>();
        id = 1;
    }

    @Override
    public List<Product> findAllProduct() {
        return productHashMap.values().stream().toList();
    }

    @Override
    public Optional<Product> findById(Long id) {
        Product product = productHashMap.get(id);
        if (product == null) {
            throw new ProductNotSuchException("A product with this id: " + id + " was not found");
        }
        return Optional.of(productHashMap.get(id));
    }

    @Override
    public void save(Product product) {
        ProductValidator.isProduct(product);
        productHashMap.put(id++, product);
    }

    @Override
    public void update(Long id, Product product) {
        ProductValidator.isProduct(product);
        if (findById(id).isEmpty()) {
            throw new ProductNotSuchException("A product with this id: " + id + " was not found");
        }
        productHashMap.replace(id, product);
    }

    @Override
    public void delete(Long id) {
        Product product = productHashMap.remove(id);
        if (product == null) {
            throw new ProductNotSuchException("A product with this id: " + id + " was not found");
        }
    }
}
