package CalculatePizzaCost.PizzaBase;

import CalculatePizzaCost.Pizza.Pizza;

public class CheeseBurst extends Pizza {

    Pizza pizza;

    public CheeseBurst(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+ 25;
    }

    @Override
    public String name() {
        return pizza.name()+ " with cheese burst base";
    }
}
