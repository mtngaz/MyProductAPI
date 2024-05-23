package org.example.productrestapi.controller;


import org.example.productrestapi.entity.Product;
import org.example.productrestapi.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findAllProduct() {
        return productService.findAllProduct();
    }

    @GetMapping("/products/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id).get();
    }

    @GetMapping(value = "/products", params = "sort")
    public List<Product> findProductsByNameSorted(@RequestParam(name = "sort") String sort) {
        return productService.findAllProductsSortedByName(sort);
    }

    @GetMapping(value = "/products", params = "less")
    public List<Product> findProductsByPriceLessThan(@RequestParam(name = "less") double price) {
        return productService.findProductsByPriceLessThan(price);
    }

    @GetMapping(value = "/products", params = "greater")
    public List<Product> findProductsByPriceGreaterThan(@RequestParam(name = "greater") double price) {
        return productService.findProductsByPriceGreaterThan(price);
    }

    @GetMapping(value = "/products", params = "partName")
    public List<Product> findProductsByPartOfName(@RequestParam(name = "partName") String name) {
        return productService.findProductsByPartOfName(name);
    }

    @PostMapping("/products")
    public ResponseEntity<String> save(@RequestBody Product product) {
        productService.save(product);
        return ResponseEntity.ok("The product was saved successfully");
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Product product) {
        productService.update(id, product);
        return ResponseEntity.ok("The product was update successfully");
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.ok("The product was delete successfully");
    }
}