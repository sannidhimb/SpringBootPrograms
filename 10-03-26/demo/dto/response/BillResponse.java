package com.example.demo.dto.response;

public class BillResponse {
    private String productname;
    private int totalPrice;
    private int netTotal;
    public BillResponse(String productname, int totalPrice, int netTotal) {
        this.productname = productname;
        this.totalPrice = totalPrice;
        this.netTotal = netTotal;
    }
    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public int getNetTotal() {
        return netTotal;
    }
    public void setNetTotal(int netTotal) {
        this.netTotal = netTotal;
    }

   


    
}
