package com.online.shop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_quantity_onhand")
	private Integer quantity_onhand;
	
	@Column(name = "product_price")
	private Integer price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity_onhand() {
		return quantity_onhand;
	}

	public void setQuantity_onhand(Integer quantity_onhand) {
		this.quantity_onhand = quantity_onhand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
