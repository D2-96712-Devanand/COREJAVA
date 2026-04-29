package com.sunbeam;

import java.util.*;

class Product {
    String id, name;
    double price;

    Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class ShoppingCart {

    private Map<String, Integer> items = new HashMap<>();
    private static List<String> orderHistory = new ArrayList<>();
    private Map<String, Product> catalog;

    ShoppingCart(Map<String, Product> catalog) {
        this.catalog = catalog;
    }

    void addItem(String productId, int qty) {
        if (catalog.containsKey(productId)) {
            items.put(productId, items.getOrDefault(productId, 0) + qty);
            System.out.println("Added " + qty + " x " + catalog.get(productId).name);
        } else {
            System.out.println("Product not found!");
        }
    }

    void checkout() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = 0;
        StringBuilder receipt = new StringBuilder("Order: ");
        
        for (String id : items.keySet()) {
            Product p = catalog.get(id);
            int qty = items.get(id);
            total += p.price * qty;
            receipt.append(qty).append("x ").append(p.name).append(" ");
        }

        String summary = receipt.toString() + "| Total: $" + total;
        orderHistory.add(summary);
        items.clear();
        System.out.println("Checkout complete: " + summary);
    }

    static void showHistory() {
        System.out.println("\n--- Global Order History ---");
        for (String record : orderHistory) System.out.println(record);
    }
}

public class Program {
    public static void main(String[] args) {

        Map<String, Product> catalog = new HashMap<>();
        catalog.put("P01", new Product("P01", "Laptop", 800.00));
        catalog.put("P02", new Product("P02", "Mouse", 25.50));
        catalog.put("P03", new Product("P03", "Keyboard", 45.00));

        ShoppingCart myCart = new ShoppingCart(catalog);

        myCart.addItem("P01", 1);
        myCart.addItem("P02", 2);
        myCart.checkout();

        myCart.addItem("P03", 1);
        myCart.checkout();

        ShoppingCart.showHistory();
    }
}
