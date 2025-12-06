package factory.pizzaFactoryMethod.pizzaStores;

import factory.pizzaFactoryMethod.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(PizzaType type) throws Exception {
		switch (type){
			case CHEESE: return new ChicagoStyleCheesePizza();
			case VEGGIE: return new ChicagoStyleVeggiePizza();
			case CLAM: return new ChicagoStyleClamPizza();
			case PEPPERONI: return new ChicagoStylePepperoniPizza();
			default: throw new Exception("Invalid pizza type");
		}
	}
}
