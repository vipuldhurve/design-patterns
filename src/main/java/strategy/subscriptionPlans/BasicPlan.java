package strategy.subscriptionPlans;

import strategy.paymentStrategy.Upi;

public class BasicPlan extends Subscription {
//    15-day plan
    private String upiId;

    public BasicPlan(String upiId) {
        super(1000);
        this.upiId = upiId;
        super.setPaymentStrategy(new Upi(upiId));
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
