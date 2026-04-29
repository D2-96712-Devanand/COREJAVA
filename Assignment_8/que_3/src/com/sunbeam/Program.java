package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("monday");
		list.add("thursday");
		list.add("saturday");
		list.add("sunday");
		
		System.out.println("Original list : " + list);
		
		list.set(1,"tuesday");
		
		System.out.println("Upadated list : " + list);
		
	}

}
