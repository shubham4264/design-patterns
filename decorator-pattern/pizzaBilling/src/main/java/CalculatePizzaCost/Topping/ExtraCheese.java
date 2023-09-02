package CalculatePizzaCost.Topping;

import CalculatePizzaCost.Pizza.Pizza;

public class ExtraCheese extends Topping{

    Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+ 50;
    }

    @Override
    public String name() {
        return pizza.name() + " with extra cheese toppings";
    }
}
