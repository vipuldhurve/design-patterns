package factory.pizzaFactoryMethod.pizzas;

public class NewYorkStylePepperoniPizza extends Pizza {

	public NewYorkStylePepperoniPizza() {
		name = "NY Style Pepperoni Pizza";
		dough = Dough.THIN_CRUST_DOUGH;
		sauce = "Marinara Sauce";
 
		toppings.add(PizzaTopping.GRATED_REGGIANO_CHEESE);
		toppings.add(PizzaTopping.SLICED_PEPPERONI);
		toppings.add(PizzaTopping.GARLIC);
		toppings.add(PizzaTopping.ONION);
		toppings.add(PizzaTopping.MUSHROOMS);
		toppings.add(PizzaTopping.RED_PEPPER);
	}
}
