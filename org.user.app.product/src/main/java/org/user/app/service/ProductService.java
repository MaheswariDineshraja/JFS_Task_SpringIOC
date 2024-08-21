package org.user.app.service;

import java.util.List;

import org.user.app.model.Product;


public interface ProductService {
	
	public Product addProduct(Product product);	
	public List<Product> displayproducts();

}
