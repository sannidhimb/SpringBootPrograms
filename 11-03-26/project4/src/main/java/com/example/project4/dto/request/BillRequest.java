package com.example.project4.dto.request;

import java.util.List;

public class BillRequest {
   private String customerName;
    private List<Integer> price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Integer> getPrice() {
        return price;
    }

    public void setPrice(List<Integer> price) {
        this.price = price;
    }


  }
