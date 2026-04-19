package week1homework;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter payment type (Cash / CreditCard):");
        String type = scanner.nextLine();

        System.out.println("Enter price:");
        String price = scanner.nextLine();

        try {
            PaymentFactory factory = new PaymentFactory();

            IPayment paymentMethod = factory.create(type);

            Payment payment = new Payment(paymentMethod);

            payment.DoPay(price);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}