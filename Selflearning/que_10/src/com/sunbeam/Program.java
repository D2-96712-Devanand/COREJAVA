package com.sunbeam;

import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class Program {
    public static void main(String[] args) {
        
        // 1. Get Summary Statistics (Best way to get multiple values at once)
        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();

        System.out.println("--- Using SummaryStatistics ---");
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());

        // 2. If you need to call sum() individually, you MUST recreate the stream
        int individualSum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("\nIndividual Sum: " + individualSum);

        // 3. Counting even numbers (Example of filtering)
        long evenCount = IntStream.rangeClosed(1, 10)
                                  .filter(n -> n % 2 == 0)
                                  .count();
        System.out.println("Count of Even Numbers: " + evenCount);
    }
}
