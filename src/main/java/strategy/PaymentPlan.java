package strategy;

import strategy.subscriptionPlans.Subscription;
import strategy.subscriptionPlans.BasicPlan;
import strategy.subscriptionPlans.GoldPlan;
import strategy.subscriptionPlans.IdType;
import strategy.subscriptionPlans.PremiumPlan;

public abstract class PaymentPlan {
    public static void main(String[] args) {
        Subscription basic = new BasicPlan("xyz@paytm");
        basic.makePayment();
        Subscription premium = new PremiumPlan("111222333");
        premium.makePayment();
        Subscription gold = new GoldPlan(IdType.UPI, "abc123@gpay");
        gold.makePayment();
    }
}
