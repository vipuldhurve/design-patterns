package factory.pizzaFactoryMethod.pizzas;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = Dough.EXTRA_THICK_CRUST_DOUGH;
        sauce = "Plum Tomato Sauce";
        toppings.add(PizzaTopping.SHREDDED_MOZZARELLA_CHEESE);
    }

    // Chicago-style pizza also overrides the cut() method
    // so that the pieces are cut into squares
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
