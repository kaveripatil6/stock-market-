package com.socgen.stockmarketcharting.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SectorPrice {
	
	
	
	public float getSectorPrice() {
		return sectorPrice;
	}
	public void setSectorPrice(float sectorPrice) {
		this.sectorPrice = sectorPrice;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public LocalDate getSectorDate() {
		return sectorDate;
	}
	public void setSectorDate(LocalDate sectorDate) {
		this.sectorDate = sectorDate;
	}
	public String getExchangeName() {
		return exchangeName;
	}
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	private float sectorPrice;
	private String sectorName;
	private LocalDate sectorDate;
	private String exchangeName;
}
