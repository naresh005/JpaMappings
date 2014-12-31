package demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "CUSTOMER")
@Table(name="CUSTOMER")
public class Customer {
       
       @Id 
       @Column(name = "CUSTOMER_ID", nullable = false)
       @GeneratedValue(strategy = GenerationType.AUTO)
       private Long customerId;

       /**
        *   Hibernate: insert into phonenumber (number, phone_id) values (?, ?)
			Hibernate: insert into customer (phone_id, customer_id) values (?, ?)
			
			If optional=false; then customer can not be saved with null phone number
        */
       
       
       @OneToOne(cascade=CascadeType.ALL)
       @JoinColumn(name="PHONE_ID")
       private PhoneNumber phoneNumber;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}  


	
       
}
