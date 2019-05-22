package com.online.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.shop.dtos.ProductDto;
import com.online.shop.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value="", method = RequestMethod.POST)
	public void addProduct(@RequestBody ProductDto productDto) {
		productService.saveProduct(productDto);
	}
}
