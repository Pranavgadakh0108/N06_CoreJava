/*
 * Q2) Vivek Furniture Store is one of the most famous furniture stores in the city. 
 * They want to automate their customer details and the total price. 
 * As an initiative, they want the system to store the customer details 
 * and help them generate the total price.
 * You, being their software consultant, have been approached to develop software 
 * to implement the functionality of generating the total price based on the bero type.
 */

package com.tns.questiontwo;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name");
        String customerName = sc.nextLine();

        System.out.println("Enter Phone Number");
        long phoneNumber = sc.nextLong();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter address");
        String address = sc.nextLine();

        @SuppressWarnings("unused")
		CustomerDetails customer = new CustomerDetails(customerName, phoneNumber, address);


        System.out.println("Enter Bero Type");
        String beroType = sc.nextLine();

        // Process based on bero type
        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = sc.nextLine();
            System.out.println("Enter Bero Height");
            int beroHeight = sc.nextInt();

            SteelBero steelBero = new SteelBero(beroType, beroColour, beroHeight);
            steelBero.calculatePrice();

            Discount discountCalculator = new Discount();
            double discount = discountCalculator.calculateDiscount(steelBero);
            double totalPrice = steelBero.getPrice() - discount;

            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String beroColour = sc.nextLine();
            System.out.println("Enter Wood Type");
            String woodType = sc.nextLine();

            WoodenBero woodenBero = new WoodenBero(beroType, beroColour, woodType);
            woodenBero.calculatePrice();

            Discount discountCalculator = new Discount();
            double discount = discountCalculator.calculateDiscount(woodenBero);
            double totalPrice = woodenBero.getPrice() - discount;

            System.out.printf("Amount needs to be paid %.2f%n", totalPrice);
        } else {
            System.out.println(beroType + " is an invalid bero type");
        }

    }
}
