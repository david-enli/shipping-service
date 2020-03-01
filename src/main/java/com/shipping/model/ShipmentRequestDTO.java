package com.shipping.model;

public class ShipmentRequestDTO {
    private String orderId;
    private Integer userId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId() {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId =  userId;
    }
}
