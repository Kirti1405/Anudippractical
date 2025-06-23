public class AbDemo {
    public static void main(String[] args) {
        CreditCardPayment c=new CreditCardPayment();
        UPI u=new UPI();
        c.process(12345);
    }
    
}
abstract class Payment{
    abstract void process(double amount);
}
class CreditCardPayment extends Payment{
    @Override
    void process(double amount){
    System.out.println("Credit Card Payment");
    }
}
class UPI extends Payment{
    @Override
    void process(double amount)
    {
        System.out.println("UPI Payment");
    }

}
