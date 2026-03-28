package com.example.billmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prod_id;
    @Column(name = "prod_name")
    private String prod_name;
    private int prod_qty;
    private double prod_mrp;
    private double tax;
    private double total_price;

    @ManyToOne
    @JoinColumn(name = "bill_id")
    private BillEntity bill;

    public long getProd_id() {
        return prod_id;
    }
    public void setProd_id(long prod_id) {
        this.prod_id = prod_id;
    }
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

     public BillEntity getBill() {
        return bill;
    }

    public void setBill(BillEntity bill) {
        this.bill = bill;
    }

    
}
