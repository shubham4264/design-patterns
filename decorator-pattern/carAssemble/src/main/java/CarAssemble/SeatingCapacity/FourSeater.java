package CarAssemble.SeatingCapacity;

import CarAssemble.Car.Car;

public class FourSeater extends SeatingCapacity{

    Car car;

    public FourSeater(Car car){
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.assemble()+ " with four seats";
    }
}
