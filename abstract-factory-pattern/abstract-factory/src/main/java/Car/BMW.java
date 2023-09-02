package Car;

public class BMW implements Car {

    private int average;

    public BMW(){
        average = 10;
    }

    @Override
    public int average() {
        return average;
    }
}
