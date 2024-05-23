package org.example.productrestapi.validation;

import org.example.productrestapi.entity.Product;
import org.example.productrestapi.exception.CharacterLimitException;
import org.example.productrestapi.exception.ProductNameNullException;
import org.example.productrestapi.exception.ProductPriceException;

public class ProductValidator {
    public static void isProduct(Product product) {
        if (product.getName() == null) {
            throw new ProductNameNullException("The product name is required when creating");
        }
        if (product.getName().length() > 256 || product.getDescription().length() > 4096) {
            throw new CharacterLimitException("The name of the product name or description is exceeded by the number of characters");
        }
        if (product.getPrice() < 0) {
            throw new ProductPriceException("The price of the product cannot be less than 0");
        }
    }
}
