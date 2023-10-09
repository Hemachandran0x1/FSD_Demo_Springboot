package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Orders;
import com.javatpoint.repository.OrdersRepository;

//defining the business logic  
@Service
public class OrdersService {
	@Autowired
	OrdersRepository ordersRepository;

//getting all orders record by using the method findaAll() of CrudRepository  
	public List<Orders> getAllOrders() {
		List<Orders> orders = new ArrayList<Orders>();
		ordersRepository.findAll().forEach(orders1 -> orders.add(orders1));
		return orders;
	}

//getting a specific record by using the method findById() of CrudRepository  
	public Orders getOrdersById(int id) {
		return ordersRepository.findById(id).get();
	}

//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Orders orders) {
		ordersRepository.save(orders);
	}

//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id) {
		ordersRepository.deleteById(id);
	}

//updating a record  
	public void update(Orders orders, int orderid) {
		ordersRepository.save(orders);
	}
}
