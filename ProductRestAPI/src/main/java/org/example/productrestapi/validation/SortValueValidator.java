package org.example.productrestapi.validation;

public class SortValueValidator {
    public static boolean isValidSortValue(String value) {
        return "name".equalsIgnoreCase(value) || "price".equalsIgnoreCase(value);
    }
}
