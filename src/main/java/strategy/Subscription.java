package designPatterns.src.main.java.strategy;

import designPatterns.src.main.java.strategy.paymentStrategy.PaymentStrategy;
import designPatterns.src.main.java.strategy.subscriptionPlans.BasicPlan;
import designPatterns.src.main.java.strategy.subscriptionPlans.GoldPlan;
import designPatterns.src.main.java.strategy.subscriptionPlans.IdType;
import designPatterns.src.main.java.strategy.subscriptionPlans.PremiumPlan;

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

    public static void main(String[] args) {
        Subscription basic = new BasicPlan("xyz@paytm");
        basic.makePayment();
        Subscription premium = new PremiumPlan("111222333");
        premium.makePayment();
        Subscription gold = new GoldPlan(IdType.UPI, "abc123@gpay");
        gold.makePayment();
    }
}
