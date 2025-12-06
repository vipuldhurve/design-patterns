package factory.pizzaFactoryMethod.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    String sauce;
    List<PizzaTopping> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + getName());
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (PizzaTopping topping : toppings) {
            System.out.println(" " + topping.getToppingName());
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }
}
