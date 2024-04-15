package dawidzapo.structural.adapter.payment_case.stripe;

public class Stripe implements Chargeable{
    @Override
    public void charge(double amount) {
        System.out.println("Payment made by: " + this.getClass() + " - amount: " + amount);
    }
}
