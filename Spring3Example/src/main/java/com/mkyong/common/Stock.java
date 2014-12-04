package com.mkyong.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;






@Entity
@Table(name="stock")
public class Stock {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	private Integer stockId;
	private String stockCode;
	private String stockName;
	
	
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	@Column(name="STOCK_CODE",unique=true,nullable=false,length=50)
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	@Column(name="STOCK_NAME",unique=true,nullable=false,length=50)
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	

}
