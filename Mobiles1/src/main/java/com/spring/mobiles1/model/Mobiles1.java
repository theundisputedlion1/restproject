package com.spring.mobiles1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobiles")
public class Mobiles1 {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private Float hp;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getHp() {
		return hp;
	}
	public void setHp(Float hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobiles1 [id=" + id + ", name=" + name + ", hp=" + hp + ", color=" + color + "]";
	}
	
}
