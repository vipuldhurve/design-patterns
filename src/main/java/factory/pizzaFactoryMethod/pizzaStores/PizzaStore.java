package factory.pizzaFactoryMethod.pizzaStores;

import factory.pizzaFactoryMethod.pizzas.Pizza;
import factory.pizzaFactoryMethod.pizzas.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) throws Exception {
        Pizza pizza;

        // createPizza() is a call to a method in the PizzaStore
        // rather than a factory object
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // All the responsibility for instantiating Pizzas
    // has been moved into a method tha acts as a factory
    protected abstract Pizza createPizza(PizzaType type) throws Exception;
}
