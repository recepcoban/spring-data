package com.recepcoban.repository;

import com.recepcoban.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Recep Çoban on 2/26/2017.
 */
public interface IUserRepository extends CrudRepository<User, Long> {
    List<User> findByFirstnameIgnoreCaseContains(@Param("f") String firstname);
}
