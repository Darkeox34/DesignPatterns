package structuralpatterns.adapter;

public class StripeAdapter implements Payments{
    StripePayments stripePayments;

    public StripeAdapter(StripePayments stripePayments) {
        this.stripePayments = stripePayments;
    }

    public void pay(Double amount){
        int amountToSend = (int) (amount * 100);

        stripePayments.sendPayment(amountToSend);
    }
}
