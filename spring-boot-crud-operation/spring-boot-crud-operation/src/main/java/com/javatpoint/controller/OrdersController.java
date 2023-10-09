package com.javatpoint.controller;
 
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.javatpoint.model.Orders;  
import com.javatpoint.service.OrdersService;  
//mark class as Controller  
@RestController  
public class OrdersController   
{  
//autowire the OrdersService class  
@Autowired  
OrdersService ordersService;  
//creating a get mapping that retrieves all the orders detail from the database   
@GetMapping("/order")  
private List<Orders> getAllOrders()   
{  
return ordersService.getAllOrders();  
}  
//creating a get mapping that retrieves the detail of a specific order  
@GetMapping("/order/{orderid}")  
private Orders getOrders(@PathVariable("orderid") int orderid)   
{  
return ordersService.getOrdersById(orderid);  
}  
//creating a delete mapping that deletes a specified order  
@DeleteMapping("/order/{orderid}")  
private void deleteOrder(@PathVariable("orderid") int orderid)   
{  
ordersService.delete(orderid);  
}  
//creating post mapping that post the order detail in the database  
@PostMapping("/orders")  
private int saveOrder(@RequestBody Orders orders)   
{  
ordersService.saveOrUpdate(orders);  
return orders.getOrderid();  
}  
//creating put mapping that updates the order detail   
@PutMapping("/orders")  
private Orders update(@RequestBody Orders orders)   
{  
ordersService.saveOrUpdate(orders);  
return orders;  
}  
}  
