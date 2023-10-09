package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table
public class Orders {
//Defining order id as primary key  
	@Id
	@Column
	private int orderid;
	@Column
	private String ordername;
	@Column
	private String products;
	@Column
	private int price;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getProducts() {
		return products;
	}

	public void set(String products) {
		this.products = products;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
