package dawidzapo.structural.adapter.paymentCase.adapters;

import dawidzapo.structural.adapter.paymentCase.paypal.PayPal;

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
