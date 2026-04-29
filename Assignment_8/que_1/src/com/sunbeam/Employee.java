package com.sunbeam;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Emp [ id = " + id + " name = " + name + "salary = " + salary;
	}

}
