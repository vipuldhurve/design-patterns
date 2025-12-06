package factory.pizzaFactoryMethod.pizzas;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = Dough.EXTRA_THICK_CRUST_DOUGH;
        sauce = "Plum Tomato Sauce";

        toppings.add(PizzaTopping.SHREDDED_MOZZARELLA_CHEESE);
        toppings.add(PizzaTopping.BLACK_OLIVES);
        toppings.add(PizzaTopping.SPINACH);
        toppings.add(PizzaTopping.EGGPLANT);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
