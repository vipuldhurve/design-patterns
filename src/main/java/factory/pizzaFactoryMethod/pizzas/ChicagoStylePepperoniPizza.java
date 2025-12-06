package factory.pizzaFactoryMethod.pizzas;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = Dough.EXTRA_THICK_CRUST_DOUGH;
        sauce = "Plum Tomato Sauce";

        toppings.add(PizzaTopping.SHREDDED_MOZZARELLA_CHEESE);
        toppings.add(PizzaTopping.BLACK_OLIVES);
        toppings.add(PizzaTopping.SPINACH);
        toppings.add(PizzaTopping.EGGPLANT);
        toppings.add(PizzaTopping.SLICED_PEPPERONI);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
