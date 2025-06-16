package structuralpatterns.adapter;


/**
 *         MAIN USAGE
 *
 *         Payments payment = new StripeAdapter(new StripePayments());
 *
 *         payment.pay(10.0);
*/

public interface Payments {
    void pay(Double amount);
}
