package CarAssemble.SeatingCapacity;

import CarAssemble.Car.Car;

public class SixSeater extends SeatingCapacity{

    Car car;

    public SixSeater(Car car){
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.assemble() + " with six seats";
    }
}
