package demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PHONENUMBER")
@Table(name="PHONENUMBER")
public class PhoneNumber {
	 @Id 
     @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PHONE_ID")
	private Long phoneId;
	
	private String number;

	public Long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
