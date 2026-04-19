package week1homework;

public class PaymentFactory {

    public IPayment create(String className) {

        IPayment payment = null;

        try {
            Class<?> clazz = Class.forName("week1homework." + className);
            payment = (IPayment) clazz.getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            System.out.println("Payment type not found: " + className);
            e.printStackTrace();
        }

        return payment;
    }
}