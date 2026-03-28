package com.example.inventory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.dto.ProductRequest;
import com.example.inventory.dto.ProductResponse;
import com.example.inventory.response.ApiResponse;
import com.example.inventory.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @PostMapping
    public ApiResponse<ProductResponse> createProduct(@RequestBody ProductRequest request){
        ProductResponse response = productService.createProduct(request);
        return new ApiResponse<>("success", response);
    }

    @GetMapping
    public ApiResponse<List<ProductResponse>> getAllProducts(){
        List<ProductResponse> responses = productService.getAllProducts();
        return new ApiResponse<>("success", responses);
    }

}

