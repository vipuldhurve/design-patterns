package factory.pizzaAbstractFactory.pizzaStores;

import factory.pizzaAbstractFactory.ingredientFactory.ChicagoPizzaIngredientFactory;
import factory.pizzaAbstractFactory.ingredientFactory.PizzaIngredientFactory;
import factory.pizzaAbstractFactory.pizzas.VeggiePizza;
import factory.pizzaAbstractFactory.pizzas.CheesePizza;
import factory.pizzaAbstractFactory.pizzas.ClamPizza;
import factory.pizzaAbstractFactory.pizzas.PepperoniPizza;
import factory.pizzaAbstractFactory.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
