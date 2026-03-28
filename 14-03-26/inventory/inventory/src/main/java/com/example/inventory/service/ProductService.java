package com.example.inventory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.inventory.dto.ProductRequest;
import com.example.inventory.dto.ProductResponse;
import com.example.inventory.entity.ProductEntity;
import com.example.inventory.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponse createProduct(ProductRequest request){
        ProductEntity productsEntity = new ProductEntity();
        productsEntity.setProdName(request.getProdName());
        productsEntity.setProdQty(request.getProdQty());
        productsEntity.setProdMrp(request.getProdMrp());
        productsEntity.setProdTax(request.getProdTax());

        ProductEntity savedProduct = productRepository.save(productsEntity);

        ProductResponse response = new ProductResponse();
        response.setId(savedProduct.getId());
        response.setProdName(savedProduct.getProdName());
        response.setProdQty(savedProduct.getProdQty());
        response.setProdMrp(savedProduct.getProdMrp());
        response.setProdTax(savedProduct.getProdTax());

        return response;
    }

    public List<ProductResponse> getAllProducts(){
        List<ProductEntity> productsEntities = productRepository.findAll();

        return productsEntities.stream().map(
            product -> {
                ProductResponse res = new ProductResponse();
                res.setId(product.getId());
                res.setProdName(product.getProdName());
                res.setProdQty(product.getProdQty());
                res.setProdMrp(product.getProdMrp());
                res.setProdTax(product.getProdTax());
                return res;
            }
        ).collect(Collectors.toList());
    }

}

