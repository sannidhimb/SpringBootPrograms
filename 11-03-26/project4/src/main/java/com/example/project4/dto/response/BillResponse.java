package com.example.project4.dto.response;

public class BillResponse {
    
    private Long id;
    private String customerName;
    private double totalPrice;
    private double gst;
    private double grandTotal;

    public BillResponse(Long id, String customerName, double totalPrice, double gst, double grandTotal) {
        this.id = id;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.gst = gst;
        this.grandTotal = grandTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
    

}