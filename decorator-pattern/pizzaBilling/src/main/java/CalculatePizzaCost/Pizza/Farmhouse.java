package CalculatePizzaCost.Pizza;

public class Farmhouse extends Pizza {

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String name() {
        return "Farmhouse";
    }
}
