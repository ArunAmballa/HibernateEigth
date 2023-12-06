package com.arun.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Students 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String address;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Branch branch;

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", address=" + address + ", branch=" + branch + "]";
	}
	
	public Students()
	{
		System.out.println("Student Object is Created");
	}

	public Students(String name, String address, Branch branch) {
		super();
		this.name = name;
		this.address = address;
		this.branch = branch;
	}
	
	
	
	
	

}
