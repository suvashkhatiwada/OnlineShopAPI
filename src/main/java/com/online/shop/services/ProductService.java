package com.online.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.shop.dtos.ProductDto;
import com.online.shop.entities.ProductEntity;
import com.online.shop.repositories.ProductRepositories;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepositories productRepository;
	
	public void saveProduct(ProductDto productDto) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setName(productDto.getName());
		productEntity.setPrice(productDto.getPrice());
		productEntity.setQuantity_onhand(productDto.getQuantity());
		
		productRepository.save(productEntity);
	}

}
