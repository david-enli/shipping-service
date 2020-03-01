package com.shipping.controllers;

import com.shipping.service.ShipmentService;
import com.shipping.model.ShipmentRequestDTO;
import com.shipping.model.ShippingAddressDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "Shipping Management System", description = "Operations pertaining to shipment")
@RestController
public class ShipmentControllers {

    @Autowired
    ShipmentService shipmentService;

    @ApiOperation(value = "Add shipping address for user")
    @RequestMapping(value = "/addShippingAddress", method = RequestMethod.POST)
    public void addShippingAddress(@RequestBody ShippingAddressDTO shippingAddress) throws Exception {

        shipmentService.addShippingAddress(shippingAddress);
    }

    @ApiOperation(value = "Retrieve shipping address for user")
    @RequestMapping(value = "/getShippingAddress", method = RequestMethod.GET)
    public String getShippingAddress(@ApiParam(value = "given userId", required = true)@RequestParam Integer userId) throws Exception {
        return shipmentService.getShippingAddress(userId);
    }

    @ApiOperation(value = "Create an shipment request")
    @RequestMapping(value = "/createShipmentRequest", method = RequestMethod.POST)
    public void createShipmentRequest(@RequestBody ShipmentRequestDTO shipmentRequestDTO) {
        shipmentService.createShipmentRequest(shipmentRequestDTO);
    }
}
