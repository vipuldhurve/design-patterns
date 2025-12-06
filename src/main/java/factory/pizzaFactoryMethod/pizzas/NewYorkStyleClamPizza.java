package factory.pizzaFactoryMethod.pizzas;

public class NewYorkStyleClamPizza extends Pizza {

	public NewYorkStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = Dough.THIN_CRUST_DOUGH;
		sauce = "Marinara Sauce";
 
		toppings.add(PizzaTopping.GRATED_REGGIANO_CHEESE);
		toppings.add(PizzaTopping.FRESH_CLAMS_FROM_LONG_ISLAND_SOUND);
	}
}
