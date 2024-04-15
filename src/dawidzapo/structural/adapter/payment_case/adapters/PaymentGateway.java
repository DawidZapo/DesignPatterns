package dawidzapo.structural.adapter.payment_case.adapters;

public interface PaymentGateway {
    void processPayment(double amount);
}
