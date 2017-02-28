package com.recepcoban.service;

import java.util.List;

import com.recepcoban.entity.Address;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
public interface IAddressService {

	Address getAddress(Long id);
	
	List<Address> getAllAddresses();
	
    void save(Address address, Long userId);

    Address findByUserId(Long userId);
}
