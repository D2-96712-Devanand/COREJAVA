package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }


    public String getName() { return name; }
    public String getCity() { return city; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return String.format("City: %-10s | Marks: %-5.1f | Name: %-10s | Roll: %d", 
                city, marks, name, roll);
    }
}

public class Program {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Dev", "Pune", 85.0),
            new Student(2, "Ram", "Mumbai", 90.0),
            new Student(3, "Siddharth", "Pune", 90.0),
            new Student(4, "Amar", "Mumbai", 90.0),
            new Student(5, "Aditya", "Delhi", 70.0)
        };

        Comparator<Student> multiSorter = Comparator
            .comparing(Student::getCity, Comparator.reverseOrder())
            .thenComparing(Student::getMarks, Comparator.reverseOrder())
            .thenComparing(Student::getName);

        Arrays.sort(students, multiSorter);

        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
