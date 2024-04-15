package dawidzapo.structural.adapter.payment_case;

import dawidzapo.structural.adapter.payment_case.adapters.PayPalAdapter;
import dawidzapo.structural.adapter.payment_case.adapters.PaymentGateway;
import dawidzapo.structural.adapter.payment_case.adapters.StripeAdapter;
import dawidzapo.structural.adapter.payment_case.paypal.PayPal;
import dawidzapo.structural.adapter.payment_case.stripe.Stripe;

public class Demo {
    public static void main(String[] args) {
        PaymentGateway payPalGateway = new PayPalAdapter(new PayPal());
        PaymentGateway stripeGateway = new StripeAdapter(new Stripe());

        payPalGateway.processPayment(100.00);
        stripeGateway.processPayment(150.00);
    }
}
