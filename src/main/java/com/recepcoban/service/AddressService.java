package com.recepcoban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.recepcoban.entity.Address;
import com.recepcoban.repository.IAddressRepository;
import com.recepcoban.repository.IUserRepository;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
@Service
@Qualifier(value = "addressService")
public class AddressService implements IAddressService {

	@Autowired
	private IAddressRepository addressRepository;
	
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public Address getAddress(Long id) {
		return addressRepository.findOne(id);
	}

	@Override
	public List<Address> getAllAddresses() {
		List<Address> addresses = (List<Address>) addressRepository.findAll();
		return addresses;
	}

	@Override
	public Address findByUserId(Long userId) {
		//Address address = addressRepository
		return null;
	}
	
	@Override
	public void save(Address address, Long userId) {
		if (address.getZipCode().isEmpty() || address.getZipCode() == null) {
            throw new NullPointerException("Zip Code is required field!");
        } else if (userId == null) {
        	throw new NullPointerException("User ID is required field!");
        }
        else {
        	address.setUserId(userId);
        	addressRepository.save(address);
        }
	}
	
}
