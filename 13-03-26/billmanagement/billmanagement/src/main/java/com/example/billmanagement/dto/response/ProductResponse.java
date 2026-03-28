package com.example.billmanagement.dto.response;

public class ProductResponse {
    private long product_id;
    private String product_name;
    private int prod_qty;
    private double prod_mrp;
    private double tax;
    private double total_price;

    public ProductResponse(long product_id, String product_name, int prod_qty, double prod_mrp, double tax,
            double total_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.prod_qty = prod_qty;
        this.prod_mrp = prod_mrp;
        this.tax = tax;
        this.total_price = total_price;
    }
    
    public long getProduct_id() {
        return product_id;
    }
    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
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
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getTotal_price() {
        return total_price;
    }
    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    
}
