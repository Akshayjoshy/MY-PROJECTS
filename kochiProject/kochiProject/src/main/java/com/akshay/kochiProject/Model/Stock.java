package com.akshay.kochiProject.Model;

/*import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Table;



@Entity
@Table(name="stock")
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "st_id")
	private Long stockId;
	
	
	@JoinColumn(name = "ve_id")
	private VenderEntity vendor;
	
	@Column(name = "st_invoice_number")
	private String stockInvoiceNumber;
	
	@Column(name = "st_date")
	private LocalDate stockDate;

	public Stock() {
		super();
	}

	public Stock(VenderEntity vendor, String stockInvoiceNumber, LocalDate stockDate) {
		super();
		this.vendor = vendor;
		this.stockInvoiceNumber = stockInvoiceNumber;
		this.stockDate = stockDate;
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public VenderEntity getVendor() {
		return vendor;
	}

	public void setVendor(VenderEntity vendor) {
		this.vendor = vendor;
	}

	public String getStockInvoiceNumber() {
		return stockInvoiceNumber;
	}

	public void setStockInvoiceNumber(String stockInvoiceNumber) {
		this.stockInvoiceNumber = stockInvoiceNumber;
	}

	public LocalDate getStockDate() {
		return stockDate;
	}

	public void setStockDate(LocalDate stockDate) {
		this.stockDate = stockDate;
	}
	
	
}*/