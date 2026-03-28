package com.example.project5.dto.response;

public class RegApiResponse<T> {
    private String status;
    private T data;
   
    public RegApiResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
