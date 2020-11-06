package com.dwivedy.firdoxAccount.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwivedy.firdoxAccount.entity.Account;
import com.dwivedy.firdoxAccount.service.Impl.AccountServiceImpl;
 
 

/**
 * @author Pawan
 *
 *         This class is the entry point for Product catalog service and acts as
 *         the controller.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class AccountController {

	 

	protected Logger logger = Logger.getLogger(AccountController.class.getName());

	@Autowired
	private AccountServiceImpl accountServiceImpl;

	 

	@PostMapping(value = "/accounts")
	public Account create(@RequestBody Account account) throws Exception {
		logger.info("products-service createProduct() invoked: " + account);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		 Date date = new Date(sdf.parse(account.getOpenDateString()).getTime());
//		 account.setOpenDate(date);
		Account accountSaved = accountServiceImpl.createCustomer(account);

		return accountSaved;

	}
	
	
	@GetMapping(value = "/accounts")
	public  List<Account> getAccounts( ) {
		 
		return accountServiceImpl.getAccounts();

		 

	}

	

//	@DeleteMapping(value = "/products/{productId}")
//	public Product deleteProduct(@PathVariable("productId") Long productId) {
//		logger.info("products-service deleteProduct() invoked: " + productId);
//
//		Product product = productCatalogServiceImpl.deleteProductById(productId);
//		if (product == null)
//			throw new RecordNotFoundException(productId);
//		else {
//			return product;
//		}
//
//	}
//
//	@GetMapping(value = "/products/{productId}")
//	public Product findProductById(@PathVariable("productId") Long productId) {
//		logger.info("products-service findProductById() invoked: " + productId);
//
//		Product product = productCatalogServiceImpl.findProductById(productId);
//		if (product == null)
//			throw new RecordNotFoundException(productId);
//		else {
//			return product;
//		}
//
//	}
//
//	@PutMapping(value = "/products/{productId}")
//	public Product updateProductById(@Valid @RequestBody Product product, @PathVariable("productId") Long productId) {
//		logger.info("products-service updateProductById() invoked: " + productId);
//
//		Product updatedProduct = productCatalogServiceImpl.updateProductById(productId, product);
//		if (updatedProduct == null)
//			throw new RecordNotFoundException(productId);
//		else {
//			return updatedProduct;
//		}
//
//	}

}
