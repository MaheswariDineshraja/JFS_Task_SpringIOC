package org.user.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user.app.model.Product;
import org.user.app.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService {
	
	@Autowired
	private ProductRepository productrepository;
	
	@Override
	public Product addProduct(Product product) {
		
		return this.productrepository.save(product);
	}

	@Override
	public List<Product> displayproducts() {
		// TODO Auto-generated method stub
		return this.productrepository.findAll();
	}

}
