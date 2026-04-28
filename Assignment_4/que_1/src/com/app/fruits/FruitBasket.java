package com.app.fruits;
import com.app.fruits.*;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        Fruit[] basket = new Fruit[sc.nextInt()];
        int counter = 0;
        int choice;

        do {
            System.out.println("\n0.Exit 1.Add Mango 2.Add Orange 3.Add Apple 4.Names 5.All Fresh 6.Stale Taste 7.Mark Stale 8.Mark Sour Stale");
            choice = sc.nextInt();

            switch (choice) {
                case 1: if(counter < basket.length) basket[counter++] = new Mango("Yellow", 0.5); break;
                case 2: if(counter < basket.length) basket[counter++] = new Orange("Orange", 0.3); break;
                case 3: if(counter < basket.length) basket[counter++] = new Apple("Red", 0.2); break;
                case 4:
                    for (Fruit f : basket) if (f != null) System.out.println(f.getName());
                    break;
                case 5:
                    for (Fruit f : basket) 
                        if (f != null && f.isFresh()) 
                            System.out.println(f + ", Taste: " + f.taste());
                    break;
                case 6:
                    for (Fruit f : basket) 
                        if (f != null && !f.isFresh()) System.out.println(f.getName() + " tastes " + f.taste());
                    break;
                case 7:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < counter) basket[idx].setFresh(false);
                    else System.out.println("Invalid index!");
                    break;
                case 8:
                    for (Fruit f : basket) 
                        if (f != null && f.taste().equals("sour")) f.setFresh(false);
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
