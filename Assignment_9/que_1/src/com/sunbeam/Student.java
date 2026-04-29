package com.sunbeam;

public class Student {
	
	int rollNo;
	private String name;
	private double marks;
	
	public Student()
	{
		
	}

	public Student(int id, String name, double marks) {
		super();
		this.rollNo = id;
		this.name = name;
		this.marks = marks;
	}

	public int getrollNo() {
		return rollNo;
	}

	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNO=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
