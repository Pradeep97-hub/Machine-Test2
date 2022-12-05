package com.javatechie.crud.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")
public class Product 
{
	@Id
	@Generated
	private int id;
	private String name;
	private int quantity;
	private double price;
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
