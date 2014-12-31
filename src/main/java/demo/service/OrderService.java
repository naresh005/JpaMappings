package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.model.Order;
import demo.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired OrderRepository orderRepository;
	
	public void save(Order order){
		orderRepository.save(order);
	}

}
