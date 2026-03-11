package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.BillRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.BillResponse;
import com.example.demo.service.BillService;

@RestController
@RequestMapping("/customer")
public class BillController {
    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }
    @PostMapping("/calc")
    public ApiResponse getResults(@RequestBody BillRequest request){
        BillResponse totalPrice=billService.calBillResponse(request);
        return new ApiResponse("Success", totalPrice);
    }
}
