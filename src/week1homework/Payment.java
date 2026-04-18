package week1homework;

public class Payment {

    private IPayment iIPayment;

    public Payment(IPayment iLog)
    {
        this.iIPayment = iLog;
    }

    public void DoPay(String price)
    {
        this.iIPayment.pay(price);
    }
}