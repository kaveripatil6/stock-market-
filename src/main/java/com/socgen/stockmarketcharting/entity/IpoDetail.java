package com.socgen.stockmarketcharting.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity


public class IpoDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(Double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public Long getTotalnumberOfShares() {
		return totalnumberOfShares;
	}
	public void setTotalnumberOfShares(Long totalnumberOfShares) {
		this.totalnumberOfShares = totalnumberOfShares;
	}
	public LocalDateTime getOpenDateTime() {
		return openDateTime;
	}
	public void setOpenDateTime(LocalDateTime openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<StockExchange> getStockExchanges() {
		return stockExchanges;
	}
	public void setStockExchanges(List<StockExchange> stockExchanges) {
		this.stockExchanges = stockExchanges;
	}
	@Column(nullable=false)
	private Double pricePerShare;
	@Column(nullable=false)
	private Long totalnumberOfShares;
	@Column(nullable=false)
	private LocalDateTime openDateTime;
	@Column(nullable=false)
	private String remarks;
	private String companyName;
	@OneToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Company company;
	@ManyToMany
	@JsonIgnore
	private List<StockExchange> stockExchanges = new ArrayList<>();
	protected IpoDetail() {
		
	}
	public IpoDetail(Double pricePerShare, Long totalnumberOfShares, LocalDateTime openDateTime, String remarks) {
		super();
		this.pricePerShare = pricePerShare;
		this.totalnumberOfShares = totalnumberOfShares;
		this.openDateTime = openDateTime;
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IpoDetail [pricePerShare=" + pricePerShare + ", totalnumberOfShares=" + totalnumberOfShares
				+ ", openDateTime=" + openDateTime + ", remarks=" + remarks + ", companyName=" + companyName + "]";
	}

	
	
}
