package CarAssemble.CarColor;

import CarAssemble.Car.Car;

public class RedColor extends CarColor {

    Car car;

    public RedColor(Car car){
        this.car = car;
    }
    @Override
    public String assemble() {
        return car.assemble()+" with red color";
    }
}
