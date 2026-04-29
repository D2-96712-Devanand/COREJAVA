package com.sunbeam;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to analyze:");
        String input = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, spaces = 0, special = 0;
        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                special++;
            }
        }


        int totalChars = input.length();
        System.out.println("\n--- Text Statistics ---");
        System.out.println("Total Characters: " + totalChars);
        System.out.println("Vowels:           " + vowels);
        System.out.println("Consonants:       " + consonants);
        System.out.println("Digits:           " + digits);
        System.out.println("White Spaces:     " + spaces);
        System.out.println("Special Chars:    " + special);
        
        if (totalChars > 0) {
            double vowelPercent = (vowels * 100.0) / totalChars;
            System.out.printf("Vowel Percentage: %.2f%%\n", vowelPercent);
        }
        
        sc.close();
    }
}
