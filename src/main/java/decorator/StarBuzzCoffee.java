package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.DarkRoast;
import decorator.beverages.Espresso;
import decorator.beverages.HouseBlend;
import decorator.condimentDecorators.Mocha;
import decorator.condimentDecorators.Soy;
import decorator.condimentDecorators.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println("\n" + beverage1.getDescription()
                + " Rs." + beverage1.cost() + " /-");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("\n" + beverage2.getDescription()
                + " Rs." + beverage2.cost() + " /-");

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println("\n" + beverage3.getDescription()
                + " Rs." + beverage3.cost() + " /- \n");
    }
}
