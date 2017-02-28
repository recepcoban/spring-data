package com.recepcoban.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.recepcoban.entity.Address;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
public interface IAddressRepository extends CrudRepository<Address, Long> {

	List<Address> findByUserId(Long userId);

}
