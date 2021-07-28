package com.socgen.stockmarketcharting.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="StockExchange")

public class StockExchange {
	@Id
	@GeneratedValue
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CompanyStockExchangeMap> getCompStockmap() {
		return compStockmap;
	}

	public void setCompStockmap(List<CompanyStockExchangeMap> compStockmap) {
		this.compStockmap = compStockmap;
	}

	private String name;
	
	@OneToMany(targetEntity = CompanyStockExchangeMap.class)
	private List<CompanyStockExchangeMap> compStockmap;
	
	
	
}
