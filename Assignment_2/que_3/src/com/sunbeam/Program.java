package com.sunbeam;

public class Program {

	public static void main(String[] args) {
	
		Date d1 = new Date(23,4,2026);
		
		System.out.println("Default date : ");
		d1.displayDate();
		
		d1.setDay(1);
		d1.setMonth(5);
		d1.setYear(2026);
		
		System.out.println("Updated date : ");
		d1.displayDate();
		
		

	}

}
