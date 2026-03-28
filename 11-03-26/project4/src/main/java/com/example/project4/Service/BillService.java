package com.example.project4.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project4.Entity.Bill;
import com.example.project4.dto.request.BillRequest;
import com.example.project4.dto.response.BillResponse;
import com.example.project4.repository.BillRepository;

@Service
public class BillService {
    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public BillResponse generateBill(BillRequest request) {

        List<Integer> prices = request.getPrice();

        double total = 0;

        for (Integer price : prices) {
            total += price;
        }

        double gst = total * 0.18;

        double grandTotal = total + gst;

        Bill bill = new Bill();

        bill.setCustomerName(request.getCustomerName());
        bill.setTotalPrice(total);
        bill.setGst(gst);
        bill.setGrandTotal(grandTotal);

        billRepository.save(bill);

        return new BillResponse(
                bill.getId(),
                bill.getCustomerName(),
                bill.getTotalPrice(),
                bill.getGst(),
                bill.getGrandTotal()
        );
    }
    public List<BillResponse> getAllBills(){

        return billRepository.findAll()
        .stream()
        .map(bill -> new BillResponse(
                bill.getId(),
                bill.getCustomerName(),
                bill.getTotalPrice(),
                bill.getGst(),
                bill.getGrandTotal()
        ))
        .toList();
    }
}

