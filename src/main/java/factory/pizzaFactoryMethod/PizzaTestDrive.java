package factory.pizzaFactoryMethod;

import factory.pizzaFactoryMethod.pizzaStores.NewYorkPizzaStore;
import factory.pizzaFactoryMethod.pizzaStores.PizzaStore;
import factory.pizzaFactoryMethod.pizzaStores.ChicagoPizzaStore;
import factory.pizzaFactoryMethod.pizzas.Pizza;
import factory.pizzaFactoryMethod.pizzas.PizzaType;

public class PizzaTestDrive {

    public static void main(String[] args) throws Exception {
        PizzaStore nyStore = new NewYorkPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.CLAM);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
