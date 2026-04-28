package com.sunbeam;

public class Program {
    public static void main(String[] args) {

        Invoice inv1 = new Invoice("1234", "Hammer", 2, 14.95);
        System.out.println("Invoice 1 Details:");
        displayInvoice(inv1);

        Invoice inv2 = new Invoice("5678", "Box of Nails", -5, -2.50);
        System.out.println("\nInvoice 2 Details (Negative values provided):");
        displayInvoice(inv2);

        inv2.setQuantity(10);
        inv2.setPricePerItem(5.99);
        System.out.println("\nInvoice 2 Updated via Setters:");
        displayInvoice(inv2);
    }

    private static void displayInvoice(Invoice invoice) {
        System.out.printf("Part Number: %s%n", invoice.getPartNumber());
        System.out.printf("Description: %s%n", invoice.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Price Per Item: $%.2f%n", invoice.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}
