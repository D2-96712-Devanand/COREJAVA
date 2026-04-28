package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Dev","Budhawat",100000);
		
		Employee e2 = new Employee("Abhi","Budhawat",120000);		
		
		System.out.println(e1.toString());
		
		double sal1 = e1.annualSalary();
		
		System.out.println("Total salary of employee : " + e1.getFirstName() + " = " + sal1);
		
		System.out.println(e2.toString());
		
		double sal2 = e2.annualSalary();
		
		System.out.println("Total salary of employee : " + e2.getFirstName() + " = " + sal2);
		

	}

}
