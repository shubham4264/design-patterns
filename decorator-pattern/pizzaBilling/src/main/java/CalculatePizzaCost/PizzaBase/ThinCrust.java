package CalculatePizzaCost.PizzaBase;

import CalculatePizzaCost.Pizza.Pizza;

public class ThinCrust extends Pizza {

    Pizza pizza;

    public ThinCrust(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 15;
    }

    @Override
    public String name() {
        return pizza.name() + " with thin crust base";
    }
}
