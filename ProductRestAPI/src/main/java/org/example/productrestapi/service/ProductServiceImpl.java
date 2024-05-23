package org.example.productrestapi.service;

import org.example.productrestapi.entity.Product;
import org.example.productrestapi.exception.ProductNotSuchException;
import org.example.productrestapi.repository.ProductRepository;
import org.example.productrestapi.validation.ProductValidator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Optional<Product> findById(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotSuchException("A product with this id: " + id + " was not found");
        }
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        ProductValidator.isProduct(product);
        productRepository.save(product);
    }

    @Override
    public void update(Long id, Product product) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotSuchException("A product with this id: " + id + " was not found");
        }
        ProductValidator.isProduct(product);
        product.setId(id);
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotSuchException("A product with this id: " + id + " was not found");
        }
        productRepository.deleteById(id);
    }
}
