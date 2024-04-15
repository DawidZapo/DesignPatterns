package dawidzapo.structural.adapter.payment_case.adapters;

import dawidzapo.structural.adapter.payment_case.paypal.PayPal;

public class PayPalAdapter implements PaymentGateway{
    private final PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}
