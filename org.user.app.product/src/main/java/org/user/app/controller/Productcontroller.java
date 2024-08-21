package org.user.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.user.app.model.Product;
import org.user.app.service.ProductService;


import jakarta.validation.Valid;

@Controller
@RequestMapping("/catalog")
public class Productcontroller {	
	
	
		
		@Autowired
		private ProductService productService;		
		
		@GetMapping("/Products")
		public String productList(Model model)
		{
			return "Products";
		}
		
		@GetMapping("/newProduct")
		public String newProduct(Model model)
		{
			model.addAttribute("product", new Product());
			return "addProduct";
			
		}
		
		@PostMapping("/addProduct")
		public String addProduct(@Valid Product product, BindingResult result, Model model )
		{
			Product addProduct=productService.addProduct(product);
	        model.addAttribute("products",productService.displayproducts());
	        return "redirect:/catalog/displayProducts";
			
		}
		
		@GetMapping("/displayProducts")
		public String displayproduct(Model model)
		{
			List<Product> display = productService.displayproducts();
	        model.addAttribute("products",display);
	        return "displayProduct";
			
		}
		
		

	


}
