package strategy.subscriptionPlans;


import strategy.paymentStrategy.CreditCard;

public class PremiumPlan extends Subscription {
//  1-year plan
    private String creditCardNumber;

    public PremiumPlan( String creditCardNumber) {
        super(15_000);
        this.creditCardNumber = creditCardNumber;
        super.setPaymentStrategy(new CreditCard(creditCardNumber));
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
