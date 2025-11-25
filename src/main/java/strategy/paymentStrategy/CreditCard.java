package strategy.paymentStrategy;

public class CreditCard implements PaymentStrategy {
    String cardNumber;

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount + " using Credit Card: " + this.cardNumber);
    }
}
