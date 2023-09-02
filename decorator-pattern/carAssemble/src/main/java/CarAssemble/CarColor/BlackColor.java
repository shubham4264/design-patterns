package CarAssemble.CarColor;

import CarAssemble.Car.Car;

public class BlackColor extends CarColor{

    Car car;

    public BlackColor (Car car){
        this.car = car;
    }
    @Override
    public String assemble() {
        return car.assemble() +" with Black Color";
    }
}
