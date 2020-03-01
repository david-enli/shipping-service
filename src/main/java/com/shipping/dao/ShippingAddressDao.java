package com.shipping.dao;

import com.shipping.model.DAOShippingAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingAddressDao extends CrudRepository<DAOShippingAddress, Integer> {


    DAOShippingAddress findOneById(long id);

}