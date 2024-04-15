package dawidzapo.structural.adapter.payment_case.paypal;

public class PayPal implements Payable{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment made by " + this.getClass() + " - amount: " + amount);
    }
}
