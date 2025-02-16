package strategy;


import strategy.paymentStrategy.PaymentStrategy;
import strategy.subscriptionPlans.BasicPlan;
import strategy.subscriptionPlans.GoldPlan;
import strategy.subscriptionPlans.IdType;
import strategy.subscriptionPlans.PremiumPlan;

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
