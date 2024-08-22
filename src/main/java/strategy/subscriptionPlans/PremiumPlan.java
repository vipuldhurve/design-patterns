package designPatterns.src.main.java.strategy.subscriptionPlans;

import designPatterns.src.main.java.strategy.Subscription;
import designPatterns.src.main.java.strategy.paymentStrategy.CreditCardPaymentStrategy;

public class PremiumPlan extends Subscription {
//  1-year plan
    private String creditCardNumber;

    public PremiumPlan( String creditCardNumber) {
        super(15_000);
        this.creditCardNumber = creditCardNumber;
        super.setPaymentStrategy(new CreditCardPaymentStrategy(creditCardNumber));
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
