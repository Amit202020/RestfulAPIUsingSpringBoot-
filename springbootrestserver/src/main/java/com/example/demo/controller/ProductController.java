package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Product;

@RestController
public class ProductController {
	
	
	@GetMapping("/products")
	public List<Product>  getAllProducts(){
		
		    return Arrays.asList(new Product(1001,"iPod","black color"),
		     new Product(1001,"iPod","black color"),
		     new Product(1001,"iPod","black color"));	   
	}

}
