package com.dwivedy.fidroxCustomer.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwivedy.firdoxCustomer.entity.Customer;
import com.dwivedy.firdoxCustomer.entity.RoleCustomer;
import com.dwivedy.firdoxCustomer.service.impl.CustomerServiceImpl;
import com.dwivedy.firdoxCustomer.service.impl.RoleuserServiceImpl;
 

/**
 * @author Pawan
 *
 *         This class is the entry point for Product catalog service and acts as
 *         the controller.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class UserRoleController {

	 

	protected Logger logger = Logger.getLogger(UserRoleController.class.getName());

	@Autowired
	private RoleuserServiceImpl roleUserServiceImpl;

	 

	@PostMapping(value = "/roles")
	public RoleCustomer createUserRole(@Valid @RequestBody RoleCustomer roleCustomer) {
		logger.info("products-service createProduct() invoked: " + roleCustomer);
		

		return roleUserServiceImpl.createUserRole(roleCustomer);

		 

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
