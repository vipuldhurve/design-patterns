package strategy.subscriptionPlans;

import strategy.paymentStrategy.PaymentStrategy;

public abstract class Subscription {
    private final double amount;

    private PaymentStrategy paymentStrategy;

    public Subscription(double amount) {
        this.amount = amount;
    }

    protected void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    };

    public double getAmount() {
        return amount;
    }

    public void makePayment(){
        this.paymentStrategy.pay(amount);
    }
}
