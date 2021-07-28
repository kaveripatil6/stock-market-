package com.socgen.stockmarketcharting.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@NamedQuery(name="Company.findByName",query="SELECT c FROM Company c WHERE c.companyName=:name")

@Entity
@Table(name="Company")
@Data
public class Company {
	
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public float getTurnover() {
		return turnover;
	}

	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public IpoDetail getIpo() {
		return ipo;
	}

	public void setIpo(IpoDetail ipo) {
		this.ipo = ipo;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public List<CompanyStockExchangeMap> getCompStockmap() {
		return compStockmap;
	}

	public void setCompStockmap(List<CompanyStockExchangeMap> compStockmap) {
		this.compStockmap = compStockmap;
	}

	@Column(nullable=false)
	private String companyName;
	private String sectorName;
	@Column(nullable=false)
	private float turnover;
	@Column(nullable=false)
	private String ceo;
	@Column(nullable=false)
	@Type(type="text")
	private String boardOfDirectors;
	@Column(nullable=false)
	@Type(type="text")
	private String briefWriteup;
	@OneToOne(fetch = FetchType.LAZY, mappedBy="company", cascade=CascadeType.REMOVE)
	@JsonIgnore
	private IpoDetail ipo;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Sector sector;
	@OneToMany(targetEntity = CompanyStockExchangeMap.class)
	@JsonIgnore
	private List<CompanyStockExchangeMap> compStockmap = new ArrayList<>();
	protected Company() {
	}

	public Company(String companyName, float turnover, String ceo, String boardOfDirectors, String briefWriteup) {
		super();
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.briefWriteup = briefWriteup;
	}

	@Override
	public String toString() {
		return "Company Name=" + companyName + "\nSector Name=" + sectorName + "\nTurnover=" + turnover
				+ "\nCEO= " + ceo + "\nBoard Of Directors=" + boardOfDirectors + "\nBrief Writeup=" + briefWriteup;
	}
	
	
}

