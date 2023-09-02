package CalculatePizzaCost.Topping;

import CalculatePizzaCost.Pizza.Pizza;

public class Mushroom extends Topping{

    Pizza pizza;

    public Mushroom(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+20;
    }

    @Override
    public String name() {
        return pizza.name() + " with Mushroom toppings";
    }
}
