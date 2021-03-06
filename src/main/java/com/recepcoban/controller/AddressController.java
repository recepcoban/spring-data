package com.recepcoban.controller;

import com.recepcoban.entity.Address;
import com.recepcoban.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
@RestController
public class AddressController {
    
    private final IAddressService addressService;

    public AddressController(@Qualifier(value = "addressService") IAddressService addressService) {
        this.addressService = addressService;
    }

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
