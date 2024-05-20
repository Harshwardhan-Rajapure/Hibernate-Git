package com.tka.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	String name;
	
	@ManyToMany(mappedBy = "laplist")
	List<Student> studlist;
		
	public Laptop() {
		
	}
	
	public Laptop(String name) {
		super();
		this.name = name;
	}
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
	
	public List<Student> getStudlist() {
		return studlist;
	}

	public void setStudlist(List<Student> studlist) {
		this.studlist = studlist;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + "]";
	}
	
}
