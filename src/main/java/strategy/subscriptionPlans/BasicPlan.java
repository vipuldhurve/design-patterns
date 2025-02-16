package strategy.subscriptionPlans;

import strategy.Subscription;
import strategy.paymentStrategy.RazorPayPaymentStrategy;

public class BasicPlan extends Subscription {
//    15-day plan
    private String upiId;

    public BasicPlan(String upiId) {
        super(1000);
        this.upiId = upiId;
        super.setPaymentStrategy(new RazorPayPaymentStrategy(upiId));
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
