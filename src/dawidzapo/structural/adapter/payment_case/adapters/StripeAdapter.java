package dawidzapo.structural.adapter.payment_case.adapters;

import dawidzapo.structural.adapter.payment_case.stripe.Stripe;

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
