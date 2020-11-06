package com.dwivedy.firdoxAccount.service.Impl;

import java.util.List;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwivedy.firdoxAccount.entity.Account;
import com.dwivedy.firdoxAccount.service.AccountService;
 

/**
 * @author Pawan
 *
 *         This class acts as a service layer having RESTful API methods implementation.
 *         
 */

@Service
public class AccountServiceImpl {
	
	@Autowired
	AccountService accountService;
	
	

	private Logger logger = Logger.getLogger(AccountServiceImpl.class.getName());



	public Account createCustomer(@Valid Account account) {
		
		return accountService.save(account);
		 
		//return null;
	}
	
	public List<Account> getAccounts() {
		
		return accountService.findAll();
		 
		//return null;
	}


 
	
//	public Customer createCustomer(Customer customer) throws Exception {
//
//		logger.info("products-service createProduct() invoked: " + customer);
//		Optional <RoleCustomer> roleCustomer=roleUserServiceImpl.findByCode(customer.getUserRole());
//		RoleCustomer roleCustomerObj= roleCustomer.isPresent()?roleCustomer.get():null;
//		if(roleCustomerObj==null) {
//			throw new Exception();
//		}
//		System.out.println(roleCustomerObj);
//		customer.setRoleCustomer(roleCustomerObj);
//		customerService.save(customer);
//		return customer;
//	}

	 
//
//	@Override
//	public Customer findCustomerById(Long productId) {
////		Optional<Customer> product = mockStorage.getProducts().stream()
////				.filter(productObj -> productObj.getId() == productId).findFirst();
//
////		return product.isPresent() ? product.get() : null;
//		return null;
//	}
//
//	@Override
//	public Customer deleteCustomerById(Long productId) {
//		logger.info("products-service deleteProduct() invoked: " + productId);
//
////		Optional<Customer> product = mockStorage.getProducts().stream()
////				.filter(productObj -> productObj.getId() == productId).findFirst().map(p -> {
////					mockStorage.getProducts().remove(p);
////					return p;
////				});
////
////		return product.isPresent() ? product.get() : null;
//		return null;
//	}
//
//	@Override
//	public Customer updateCustomerById(Long productId, Customer productUpdate) {
//		logger.info("products-service updateProductById() invoked: " + productId);
////		Optional<Customer> product = mockStorage.getProducts().stream()
////				.filter(productObj -> productObj.getId() == productId).findFirst().map(p -> {
////					productUpdate.setId(p.getId());
////					mockStorage.getProducts().add(productUpdate);
////					mockStorage.getProducts().remove(p);
////					return productUpdate;
////				});
////
////		return product.isPresent() ? product.get() : null;
//		return null;
//	}



	 

}
