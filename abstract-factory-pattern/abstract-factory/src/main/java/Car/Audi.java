package Car;

public class Audi implements Car {

    private int average;

    public Audi(){
        average = 15;
    }

    @Override
    public int average() {
        return average;
    }
}
