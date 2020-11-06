package com.dwivedy.firdoxAccount.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwivedy.firdoxAccount.entity.Account;
 

//@Repository
public interface AccountService extends JpaRepository<Account, Integer>{

	
//
//	/**
//	 * Performs create product
//	 * 
//	 * @param product
//	 * 
//	 * 
//	 */
//	Customer createCustomer(Customer customer);
//
//	
//	/**
//	 * Performs complete find of object matched by id
//	 * 
//	 * @param productId
//	 * @throws RecordNotFoundException returns product
//	 */
//	Customer findCustomerById(Long customerId);
//
//	/**
//	 * Performs complete delete of object matched by id
//	 * 
//	 * @param productId
//	 * @throws RecordNotFoundException returns product
//	 */
//	Customer deleteCustomerById(Long customerId);
//
//	/**
//	 * Performs complete replacement of the object matched by Id
//	 * 
//	 * @param productId,product
//	 * @throws RecordNotFoundException
//	 * 
//	 */
//	Customer updateCustomerById(Long productId, Customer customer);

}
