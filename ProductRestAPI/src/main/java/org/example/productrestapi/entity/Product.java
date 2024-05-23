package org.example.productrestapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public final class Product {
    private final String name;
    private final String description;
    private final double price;
    private final boolean availability;
}
