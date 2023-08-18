package com.office.portal.repo;

import org.springframework.data.repository.CrudRepository;

import com.office.portal.entity.User;

public interface UserRepository extends CrudRepository<User , Integer>{

}
