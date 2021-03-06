package com.recepcoban.service;

import com.recepcoban.entity.Address;

import java.util.List;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
public interface IAddressService {

	Address getAddress(Long id);
	
	List<Address> getAllAddresses();

    Address save(Address address, Long userId);

    Address findByUserId(Long userId);
}
