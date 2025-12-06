package factory.pizzaFactoryMethod.pizzas;

public class NewYorkStyleCheesePizza extends Pizza {

    public NewYorkStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = Dough.THIN_CRUST_DOUGH;
        sauce = "Marinara Sauce";
        toppings.add(PizzaTopping.GRATED_REGGIANO_CHEESE);
    }
}
