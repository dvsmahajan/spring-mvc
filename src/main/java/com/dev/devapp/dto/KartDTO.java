package com.dev.devapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="kart_table")
public class KartDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="kart_id")
	private int kartId;
	@Column(name="kart_item")
	private String item;
	@Column(name="kart_quantity")
	private String quantity;
	@Column(name="kart_price")
	private double price;
	
	
	
	public KartDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getKartId() {
		return kartId;
	}


	public void setKartId(int kartId) {
		this.kartId = kartId;
	}


	public String getItem() {
		return item;
	}


	public void setItem(String item) {
		this.item = item;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
