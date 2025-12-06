package factory.pizzaFactoryMethod.pizzas;

public enum PizzaTopping {
	GRATED_REGGIANO_CHEESE("Grated Reggiano Cheese"),
	GARLIC("Garlic"),
	ONION("Onion"),
	MUSHROOMS("Mushrooms"),
	SLICED_PEPPERONI("Sliced Pepperoni"),
	RED_PEPPER("Red Pepper"),
	SHREDDED_MOZZARELLA_CHEESE("Shredded Mozzarella Cheese"),
	BLACK_OLIVES("Black Olives"),
	SPINACH("Spinach"),
	EGGPLANT("Eggplant"),
	FROZEN_CLAMS_FROM_CHESAPEAKE_BAY("Frozen Clams from Chesapeake Bay"),
	FRESH_CLAMS_FROM_LONG_ISLAND_SOUND("Fresh Clams from Long Island Sound");

	private final String toppingName;

	private PizzaTopping(String toppingName) {
		this.toppingName = toppingName;
	}

	public String getToppingName() {
		return toppingName;
	}
}
