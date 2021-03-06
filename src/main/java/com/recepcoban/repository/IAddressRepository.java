package com.recepcoban.repository;

import com.recepcoban.entity.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Recep Çoban on 2/28/2017.
 */
public interface IAddressRepository extends CrudRepository<Address, Long> {

	List<Address> findByUserId(Long userId);

}
