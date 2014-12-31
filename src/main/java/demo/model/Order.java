package demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity(name = "ORDERS")
@Table(name="ORDERS")
public class Order {
       
       @Id 
       @Column(name = "ORDER_ID", nullable = false)
       @GeneratedValue(strategy = GenerationType.AUTO)
       private Long orderId;
       
       @Column(name = "CUST_ID")
       private Long custId;
       
       @Column(name = "TOTAL_PRICE", precision = 2)
       private double totPrice;
       
       @Column(name = "OREDER_DESC")
       private String orderDesc;
       
       @Column(name = "ORDER_DATE")  
       private Date orderDt;

       /** When order is saved, the following queries are generated. Owning side is Invoice
        * Hibernate: insert into invoice (order_id, invoice_id) values (?, ?)
		  Hibernate: insert into orders (cust_id, oreder_desc, order_date, total_price, last_updated_time, order_id) values (?, ?, ?, ?, ?, ?)
		  
		  Optional= false does not have any affect in the below mapping
        */
       @OneToOne(cascade=CascadeType.ALL, 
       mappedBy="order",targetEntity=Invoice.class)
       private Invoice invoice;  
       
       @Version
       @Column(name = "LAST_UPDATED_TIME")
       private Date updatedTime;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public double getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(double totPrice) {
		this.totPrice = totPrice;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public Date getOrderDt() {
		return orderDt;
	}

	public void setOrderDt(Date orderDt) {
		this.orderDt = orderDt;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
       
}
