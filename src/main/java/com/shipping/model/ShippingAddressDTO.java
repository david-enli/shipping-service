package com.shipping.model;

import java.io.Serializable;

public class ShippingAddressDTO implements Serializable {
    private String address;
    private Integer userId;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
