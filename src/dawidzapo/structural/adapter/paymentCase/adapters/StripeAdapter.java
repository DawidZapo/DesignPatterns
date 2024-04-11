package dawidzapo.structural.adapter.paymentCase.adapters;

import dawidzapo.structural.adapter.paymentCase.stripe.Stripe;

public class StripeAdapter implements PaymentGateway{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.charge(amount);
    }
}
