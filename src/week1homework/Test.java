package week1homework;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select payment method:");
        System.out.println("1 - Cash");
        System.out.println("2 - Credit Card");

        int choice = scanner.nextInt();

        System.out.println("Enter the price:");
        double price = scanner.nextDouble();

        Payment payment;

        if (choice == 1) {
            payment = new Payment(new Cash());
        } else {
            payment = new Payment(new CreditCard());
        }

        payment.DoPay("Payment amount: " + price);
    }
}