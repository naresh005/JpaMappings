package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Customer;
import demo.model.Invoice;
import demo.model.Order;
import demo.model.PhoneNumber;

@RestController
public class OrderController {
	
	@Autowired OrderService orderService;
	
	@Autowired CustomerService customerService;
	
	@RequestMapping(value="/createorder", method=RequestMethod.GET)
	public String createRandomOrder(@RequestParam long orderId){
		
		Order order = new Order();
		order.setOrderDesc("Test order");
		
		Invoice invoice = new Invoice();
		//order.setInvoice(invoice);
		
		orderService.save(order);
		
		return "success";
		
	} 
	
	@RequestMapping(value="/createcustomer", method=RequestMethod.GET)
	public String createRandomCustomer(@RequestParam long customerId){
		
		Customer customer = new Customer();
		
		PhoneNumber phone = new PhoneNumber();
		
		//customer.setPhoneNumber(phone);
		
		customerService.save(customer);
		
		return "success";
		
	} 

}
