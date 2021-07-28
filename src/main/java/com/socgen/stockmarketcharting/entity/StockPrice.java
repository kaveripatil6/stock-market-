package com.socgen.stockmarketcharting.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="StockPrice")

@NamedQuery(name="StockPrice.getDate", query = "SELECT c FROM StockPrice c WHERE c.datee BETWEEN :startDate AND :endDate")
public class StockPrice {
	
	@Id
	@GeneratedValue
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanycode() {
		return companycode;
	}
	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}
	public String getExchangename() {
		return exchangename;
	}
	public void setExchangename(String exchangename) {
		this.exchangename = exchangename;
	}
	public float getShareprice() {
		return shareprice;
	}
	public void setShareprice(float shareprice) {
		this.shareprice = shareprice;
	}
	public LocalDate getDatee() {
		return datee;
	}
	public void setDatee(LocalDate datee) {
		this.datee = datee;
	}
	public LocalTime getTimee() {
		return timee;
	}
	public void setTimee(LocalTime timee) {
		this.timee = timee;
	}
	public LocalDateTime getLocaldatetime() {
		return localdatetime;
	}
	public void setLocaldatetime(LocalDateTime localdatetime) {
		this.localdatetime = localdatetime;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	private String companycode;
	private String exchangename;
	private float shareprice;
	private LocalDate datee;
	private LocalTime timee;
	private LocalDateTime localdatetime;
	@ManyToOne(fetch=FetchType.LAZY)
	private Company company;
	public StockPrice(String companycode, String exchangename, float shareprice, LocalDate datee, LocalTime timee,
			LocalDateTime localdatetime) {
		super();
		this.companycode = companycode;
		this.exchangename = exchangename;
		this.shareprice = shareprice;
		this.datee = datee;
		this.timee = timee;
		this.localdatetime = localdatetime;
	}
	public StockPrice() {
		super();
	}

	
}
