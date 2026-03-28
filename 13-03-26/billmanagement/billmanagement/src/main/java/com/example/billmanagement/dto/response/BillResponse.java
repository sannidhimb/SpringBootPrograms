package com.example.billmanagement.dto.response;

public class BillResponse {
    private long bill_id;

    public BillResponse(long bill_id) {
        this.bill_id = bill_id;
    }

    public long getBill_id() {
        return bill_id;
    }

    public void setBill_id(long bill_id) {
        this.bill_id = bill_id;
    }

    
    
}
