package com.sunbeam;

import java.util.Scanner;

public class Program {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.print("Enter the String : " );
    	
    	String text = sc.nextLine();
    	
        String trimmedText = text.trim();

        if (trimmedText.isEmpty()) {
            System.out.println("Word count: 0");
        } else {

            String[] words = trimmedText.split("\\s+");

            System.out.println("Word count: " + words.length);
        }
    }
}
