package strategy.paymentStrategy;

public class Upi implements PaymentStrategy {
    String upiId;

    public Upi(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount + " using UPI ID: " + this.upiId);
    }
}
