package com.example.week6cicd;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value=0,message="id value must be greater than 1")
    private int id;
    @NotBlank(message="Product name cannot be blank")
    private String name;
    @PositiveOrZero(message = "Price cannot be negative")
    private double price;
}
