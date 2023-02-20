package org.tnsindia.singletableinhertance;

import java.io.Serializable;

import javax.persistence.Id;

public class Employee implements Serializable {
private static final long serialVersionUID = 1L;
	
	//data members
	@Id
	private int id;
	private String name;
	private double salary;
	
	//getters and setters method
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

