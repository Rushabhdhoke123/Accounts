package com.springboot.accounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.accounts.model.Accounts;

public interface AccountRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);
	

}
