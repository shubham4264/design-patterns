package CalculatePizzaCost.Pizza;

public class Margherita extends Pizza {

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String name() {
        return "Margherita";
    }
}
