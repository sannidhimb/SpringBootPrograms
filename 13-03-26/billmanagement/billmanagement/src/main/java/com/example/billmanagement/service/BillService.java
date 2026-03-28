package com.example.billmanagement.service;

import org.springframework.stereotype.Service;

import com.example.billmanagement.dto.request.ProductRequest;
import com.example.billmanagement.dto.request.UserRequest;
import com.example.billmanagement.dto.response.BillResponse;
import com.example.billmanagement.dto.response.ProductResponse;
import com.example.billmanagement.dto.response.UserResponse;
import com.example.billmanagement.entity.BillEntity;
import com.example.billmanagement.entity.ProductEntity;
import com.example.billmanagement.entity.UserEntity;
import com.example.billmanagement.repository.BillRepository;
import com.example.billmanagement.repository.ProductRepository;
import com.example.billmanagement.repository.UserRepository;

@Service
public class BillService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final BillRepository billRepository;

    public BillService(UserRepository userRepository,
                       ProductRepository productRepository,
                       BillRepository billRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.billRepository = billRepository;
    }

    public UserResponse createUser(UserRequest request) {
        UserEntity user = new UserEntity();
        user.setName(request.getName());

        UserEntity savedUser = userRepository.save(user);

        return new UserResponse(
                savedUser.getUser_id(),
                savedUser.getName()
        );
    }

    public BillResponse createBill(Long userId) {
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        BillEntity bill = new BillEntity();
        bill.setUser(user);

        BillEntity savedBill = billRepository.save(bill);

        return new BillResponse(
                savedBill.getBill_id()
        );
    }

    public ProductResponse calculateBill(Long billId, ProductRequest req) {
        BillEntity bill = billRepository.findById(billId)
                .orElseThrow(() -> new RuntimeException("Bill not found"));

        double subtotal = req.getProd_qty() * req.getProd_mrp();
        double tax = subtotal * 18 / 100.0;
        double totalPrice = subtotal + tax;

        ProductEntity product = new ProductEntity();
        product.setProd_name(req.getProd_name());
        product.setProd_qty(req.getProd_qty());
        product.setProd_mrp(req.getProd_mrp());
        product.setTax(tax);
        product.setTotal_price(totalPrice);
        product.setBill(bill);

        ProductEntity savedProduct = productRepository.save(product);

        return new ProductResponse(
                savedProduct.getProd_id(),
                savedProduct.getProd_name(),
                savedProduct.getProd_qty(),
                savedProduct.getProd_mrp(),
                savedProduct.getTax(),
                savedProduct.getTotal_price()
        );
    }
}