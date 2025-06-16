package structuralpatterns.adapter;

public class StripePayments {
    void sendPayment(int cents){
        System.out.println("You've sent " + cents + " cents with Stripe!");
    }
}
