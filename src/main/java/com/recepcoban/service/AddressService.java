package com.recepcoban.service;

import com.recepcoban.entity.Address;
import com.recepcoban.repository.IAddressRepository;
import com.recepcoban.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
@Service
@Qualifier(value = "addressService")
public class AddressService implements IAddressService {

	private final IAddressRepository addressRepository;
	private final IUserRepository userRepository;

	public AddressService(IAddressRepository addressRepository, IUserRepository userRepository) {
		this.addressRepository = addressRepository;
		this.userRepository = userRepository;
	}

	@Override
	public Address getAddress(Long id) {
		return addressRepository.findOne(id);
	}

	@Override
	public List<Address> getAllAddresses() {
		return (List<Address>) addressRepository.findAll();
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
