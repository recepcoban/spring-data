package com.recepcoban.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recepcoban.entity.Address;
import com.recepcoban.service.IAddressService;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@RestController
public class AddressController {
    
    @Autowired
    @Qualifier(value = "addressService")
    private IAddressService addressService;
    
    @GetMapping(value = "/address/{id}")
    public Address getAddress(@PathVariable Long id){
    	return addressService.getAddress(id);
    }
    
    @GetMapping(value = "/addresses")
    public List<Address> getAllAddresses(){
    	List<Address> addresses = (List<Address>) addressService.getAllAddresses();
    	return addresses;
    }
    
    @PostMapping(value = "/user/{userId}/address")
    public void saveAddress(@RequestBody Address address, @PathVariable Long userId){
    	addressService.save(address, userId);
    }
}
