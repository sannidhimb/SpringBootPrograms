package com.example.demo.dto.response;

public class ApiResponse {
    private String TransactionStatus;
    private BillResponse data;
    
    public ApiResponse(String transactionStatus, BillResponse data) {
        TransactionStatus = transactionStatus;
        this.data = data;
    }
    
    public String getTransactionStatus() {
        return TransactionStatus;
    }
    public void setTransactionStatus(String transactionStatus) {
        TransactionStatus = transactionStatus;
    }
    public BillResponse getData() {
        return data;
    }
    public void setData(BillResponse data) {
        this.data = data;
    }
    
    
}
