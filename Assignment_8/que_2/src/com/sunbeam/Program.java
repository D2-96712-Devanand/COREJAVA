package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    

    static class ListOrderComparator implements Comparator<String> {
        @Override
        public int compare(String x, String y) {

            int diff = y.compareTo(x);
            
            return diff;
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("White");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Skyblue");

        list.sort(new ListOrderComparator());
        
//        System.out.println("Ascending sorted list : " + list);
        
        
        System.out.println("Descending sorted list : " + list);
    }
}
