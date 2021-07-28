package com.socgen.stockmarketcharting.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="CompanyStockExchangemap")

@NamedQuery(name="CompanyStockExchange.findById",query="SELECT company FROM CompanyStockExchangeMap c WHERE c.stockexchange=:stockexchange")
@NamedQuery(name="CompanyStockExchange.findBycompanyCode",query="SELECT companyCode FROM CompanyStockExchangeMap c WHERE c.stockexchange=:stockexchange AND c.company=:company")
public class CompanyStockExchangeMap {
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public StockExchange getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(StockExchange stockexchange) {
		this.stockexchange = stockexchange;
	}
	@Id
	@GeneratedValue
	private Long id;
	private String companyCode;
	@ManyToOne(fetch=FetchType.LAZY)
	private Company company;
	@ManyToOne(fetch=FetchType.LAZY)
	private StockExchange stockexchange;
	public CompanyStockExchangeMap() {
		super();
	}
	
	
}
