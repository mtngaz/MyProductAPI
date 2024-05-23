package org.example.productrestapi.controller;

import org.example.productrestapi.entity.Product;
import org.example.productrestapi.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> findAllProduct() {
        return productRepository.findAllProduct();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id) {
        return productRepository.findById(id).get();
    }

    @PostMapping("/products")
    public ResponseEntity<String> save(@RequestBody Product product) {
        productRepository.save(product);
        return ResponseEntity.ok("The product was saved successfully");
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Product product) {
        productRepository.update(id, product);
        return ResponseEntity.ok("The product was update successfully");
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        productRepository.delete(id);
        return ResponseEntity.ok("The product was delete successfully");
    }
}
