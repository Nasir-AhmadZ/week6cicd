package com.example.week6cicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService myProduct;
    private Product product;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }





    @PostMapping("/newProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product)
    {
        this.product = product;
        //business logic to add this to a database
        //return list of all products from the database
        return myProduct.addProduct(product);
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct()
    {
        return myProduct.getProduct();
    }
}
