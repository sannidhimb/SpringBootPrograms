package com.example.billmanagement.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.billmanagement.dto.request.ProductRequest;
import com.example.billmanagement.dto.request.UserRequest;
import com.example.billmanagement.dto.response.BillResponse;
import com.example.billmanagement.dto.response.ProductResponse;
import com.example.billmanagement.dto.response.UserResponse;
import com.example.billmanagement.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/user")
    public UserResponse createUser(@RequestBody UserRequest request) {
        return billService.createUser(request);
    }

    @PostMapping("/user/{userId}")
    public BillResponse createBill(@PathVariable Long userId) {
        return billService.createBill(userId);
    }

    @PostMapping("/{billId}/product")
    public ProductResponse calculateBill(@PathVariable Long billId,
                                         @RequestBody ProductRequest request) {
        return billService.calculateBill(billId, request);
    }
}