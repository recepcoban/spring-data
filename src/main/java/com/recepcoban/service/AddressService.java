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
	public Address save(Address address, Long userId) {
		address.setUserId(userId);
		return addressRepository.save(address);
	}
	
}
