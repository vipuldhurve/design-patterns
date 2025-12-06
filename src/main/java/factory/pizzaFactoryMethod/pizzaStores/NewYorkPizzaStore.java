package factory.pizzaFactoryMethod.pizzaStores;

import factory.pizzaFactoryMethod.pizzas.*;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) throws Exception {
        switch (type){
            case CHEESE: return new NewYorkStyleCheesePizza();
            case VEGGIE: return new NewYorkStyleVeggiePizza();
            case CLAM: return new NewYorkStyleClamPizza();
            case PEPPERONI: return new NewYorkStylePepperoniPizza();
            default: throw new Exception("Invalid pizza type");
        }
    }
}
