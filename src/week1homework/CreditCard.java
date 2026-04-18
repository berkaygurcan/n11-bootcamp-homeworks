package week1homework;

public class CreditCard implements IPayment{

    @Override
    public void pay(String price) {
        System.out.println(price + "$ credit card payment done");

    }
}
