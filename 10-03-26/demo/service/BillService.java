package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.BillRequest;
import com.example.demo.dto.response.BillResponse;

@Service
public class BillService {
    public BillResponse calBillResponse(BillRequest req){
       int totalPrice=1000;
       totalPrice=req.getPrice1()+req.getPrice2()+req.getPrice3()+req.getPrice4()+req.getPrice5()+req.getPrice6()+req.getPrice7()+req.getPrice8()+req.getPrice9()+req.getPrice10();
       int tax=totalPrice*18/100;
       int netTotal=totalPrice-tax;

       return new BillResponse(req.getProductname(), totalPrice,netTotal);
    }
}
