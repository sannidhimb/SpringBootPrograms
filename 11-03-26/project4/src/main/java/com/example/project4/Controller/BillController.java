package com.example.project4.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project4.Service.BillService;
import com.example.project4.dto.request.BillRequest;
import com.example.project4.dto.response.ApiResponse;
import com.example.project4.dto.response.BillResponse;

@RestController
@RequestMapping("/bill")
public class BillController {
    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/process")
    public ApiResponse<BillResponse> generateBill(@RequestBody BillRequest request) {

        BillResponse response = billService.generateBill(request);

        return new ApiResponse<>("Bill generated successfully", response);
    }

    @GetMapping("/result")
    public ApiResponse<List<BillResponse>> getAllBills() {

        List<BillResponse> bills = billService.getAllBills();

        return new ApiResponse<>("Bills fetched successfully", bills);
    }
}



