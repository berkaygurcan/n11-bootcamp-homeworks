package week1homework;

public class Cash implements IPayment{
    @Override
    public void pay(String price) {
        System.out.println(price + "$ cash payment done");
    }
}
