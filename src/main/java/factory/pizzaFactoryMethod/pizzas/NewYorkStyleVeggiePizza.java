package factory.pizzaFactoryMethod.pizzas;

public class NewYorkStyleVeggiePizza extends Pizza {

	public NewYorkStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = Dough.THIN_CRUST_DOUGH;
		sauce = "Marinara Sauce";
 
		toppings.add(PizzaTopping.GRATED_REGGIANO_CHEESE);
		toppings.add(PizzaTopping.GARLIC);
		toppings.add(PizzaTopping.ONION);
		toppings.add(PizzaTopping.MUSHROOMS);
		toppings.add(PizzaTopping.RED_PEPPER);
	}
}
