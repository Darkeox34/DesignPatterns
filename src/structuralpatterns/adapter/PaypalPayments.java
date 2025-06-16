package structuralpatterns.adapter;

public class PaypalPayments implements Payments {
    public void pay(Double amount){
        System.out.println("You've sent" + amount +" euros with PayPal!");
    }
}
