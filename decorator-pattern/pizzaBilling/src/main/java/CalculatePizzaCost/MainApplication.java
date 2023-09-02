package CalculatePizzaCost;

import CalculatePizzaCost.Pizza.Farmhouse;
import CalculatePizzaCost.Pizza.Margherita;
import CalculatePizzaCost.Pizza.Pizza;
import CalculatePizzaCost.PizzaBase.CheeseBurst;
import CalculatePizzaCost.PizzaBase.ThinCrust;
import CalculatePizzaCost.Topping.ExtraCheese;
import CalculatePizzaCost.Topping.Mushroom;

public class MainApplication {

    public static void main(String[] args){

        Pizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Price for "+ pizza.name() + " is "+ pizza.cost());

        Pizza pizza1 = new Mushroom(new Farmhouse());
        System.out.println("Price for "+ pizza1.name() + " is "+ pizza1.cost());

        Pizza pizza2 = new Mushroom(new ExtraCheese(new CheeseBurst(new Margherita())));
        System.out.println("Price for "+ pizza2.name() + " is "+ pizza2.cost());

        Pizza pizza3 = new ExtraCheese(new ThinCrust(new CheeseBurst(new Farmhouse())));
        System.out.println("Price for "+ pizza3.name() + " is "+ pizza3.cost());

    }
}
