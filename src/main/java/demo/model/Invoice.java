package demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="INVOICE")
@Table(name="Invoice")
public class Invoice {
	
	 @Id 
     @Column(name = "INVOICE_ID", nullable = false)
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long invoiceId;
	 
	 @OneToOne
	 @JoinColumn(name="ORDER_ID")
	 private Order order;

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	 

}
