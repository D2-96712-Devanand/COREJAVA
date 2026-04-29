package com.sunbeam;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Program {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the number : " );
    	
        int number = sc.nextInt();

        long factorial = LongStream.rangeClosed(1, number)
                                   .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
