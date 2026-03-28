package com.example.billmanagement.dto.request;

public class ProductRequest {
    private String prod_name;
    private int prod_qty;
    private double prod_mrp;
    
    public String getProd_name() {
        return prod_name;
    }
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
    public int getProd_qty() {
        return prod_qty;
    }
    public void setProd_qty(int prod_qty) {
        this.prod_qty = prod_qty;
    }
    public double getProd_mrp() {
        return prod_mrp;
    }
    public void setProd_mrp(double prod_mrp) {
        this.prod_mrp = prod_mrp;
    }

    
    
}
