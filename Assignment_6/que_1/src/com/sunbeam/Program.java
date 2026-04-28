package com.sunbeam;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books (Forward)");
            System.out.println("3. Display All Books (Reverse)");
            System.out.println("4. Delete Book at Index");
            System.out.println("5. Sort by Price (Descending)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    library.add(new Book(isbn, price, author, qty));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.println("Forward List:");
                    
                    ListIterator<Book> forwardIt = library.listIterator();
                    while (forwardIt.hasNext()) {
                        System.out.println(forwardIt.next());
                    }
                    break;

                case 3:
                    System.out.println("Reverse List:");
                    
                    ListIterator<Book> reverseIt = library.listIterator(library.size());
                    while (reverseIt.hasPrevious()) {
                        System.out.println(reverseIt.previous());
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete (0 to " + (library.size() - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < library.size()) {
                        library.remove(index);
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    library.sort((b1, b2) -> Double.compare(b2.price, b1.price));
                    System.out.println("Books sorted by price (High to Low).");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice...");
            }
        } while (choice != 6);
        
        sc.close();
    }
}
