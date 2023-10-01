package com.schoolofnet.entity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.schoolofnet.entity.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	public Customer findByName(String name);
}
