package Car;

public class Fortuner implements Car {

    private int average;

    public Fortuner(){
        average = 20;
    }

    @Override
    public int average() {
        return average;
    }
}
