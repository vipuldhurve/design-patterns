package factory.pizzaFactoryMethod.pizzas;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = Dough.EXTRA_THICK_CRUST_DOUGH;
        sauce = "Plum Tomato Sauce";

        toppings.add(PizzaTopping.SHREDDED_MOZZARELLA_CHEESE);
        toppings.add(PizzaTopping.FROZEN_CLAMS_FROM_CHESAPEAKE_BAY);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
