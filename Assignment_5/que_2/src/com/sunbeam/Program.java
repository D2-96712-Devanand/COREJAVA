package com.sunbeam;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Enter the string : ");
    	
        String str = sc.next();
        
        boolean temp = isPalindrome(str);
        
        
        System.out.println("String " + str + " is palindrome: " + temp);
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
        	
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
