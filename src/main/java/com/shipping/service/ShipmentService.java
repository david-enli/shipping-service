package com.shipping.service;

import com.shipping.dao.ShippingAddressDao;
import com.shipping.model.DAOShippingAddress;
import com.shipping.model.ShipmentRequestDTO;
import com.shipping.model.ShippingAddressDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {
    @Autowired
    ShippingAddressDao shippingAddressDao;
    public void addShippingAddress(ShippingAddressDTO shippingAddressDTO) {
        DAOShippingAddress daoShippingAddress = new DAOShippingAddress();
        daoShippingAddress.setAddress(shippingAddressDTO.getAddress());
        daoShippingAddress.setUserId(shippingAddressDTO.getUserId());
        shippingAddressDao.save(daoShippingAddress);

    }

    public String getShippingAddress(Integer userId) {
        return shippingAddressDao.findOneById(userId).getAddress();
    }

    public void createShipmentRequest(ShipmentRequestDTO shipmentRequestDTO) {
        
    }
}
