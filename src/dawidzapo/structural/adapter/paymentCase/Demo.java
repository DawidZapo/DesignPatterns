package dawidzapo.structural.adapter.paymentCase;

import dawidzapo.structural.adapter.paymentCase.adapters.PayPalAdapter;
import dawidzapo.structural.adapter.paymentCase.adapters.PaymentGateway;
import dawidzapo.structural.adapter.paymentCase.adapters.StripeAdapter;
import dawidzapo.structural.adapter.paymentCase.paypal.PayPal;
import dawidzapo.structural.adapter.paymentCase.stripe.Stripe;

public class Demo {
    public static void main(String[] args) {
        PaymentGateway payPalGateway = new PayPalAdapter(new PayPal());
        PaymentGateway stripeGateway = new StripeAdapter(new Stripe());

        payPalGateway.processPayment(100.00);
        stripeGateway.processPayment(150.00);
    }
}
