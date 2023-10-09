package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;  
import com.javatpoint.model.Orders;  
//repository that extends CrudRepository  
public interface OrdersRepository extends CrudRepository<Orders, Integer>  
{  
}  
