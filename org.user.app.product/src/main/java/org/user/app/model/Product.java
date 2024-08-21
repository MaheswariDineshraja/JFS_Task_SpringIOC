package org.user.app.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
	
	@Id
	private String name;
	
	
	private int price;
	
	
	@Column(name="category")
	@NotBlank(message="category is Mandatory")	
	private String category;
	
	
	

}