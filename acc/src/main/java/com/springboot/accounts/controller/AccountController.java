package com.springboot.accounts.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.accounts.model.Accounts;
import com.springboot.accounts.model.Customers;
//import com.springboot.accounts.model.CustomerModel;
import com.springboot.accounts.repository.AccountRepository;



@RestController
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@PostMapping("/accounts")
	public Accounts getAccountDetails(@RequestBody Customers customer) {
		Accounts accounts = accountRepository.findByCustomerId(customer.getCustomerId());
		return accounts;
		
	}

}
