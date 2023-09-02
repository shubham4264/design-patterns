package CarAssemble;

import CarAssemble.Car.Car;
import CarAssemble.Car.SedanCar;
import CarAssemble.Car.SportsCar;
import CarAssemble.CarColor.BlackColor;
import CarAssemble.CarColor.RedColor;
import CarAssemble.SeatingCapacity.FourSeater;

public class MainApplication {

    public static void main(String[] args){

        Car car = new RedColor(new SportsCar());
        System.out.println(car.assemble());

        Car car1 = new BlackColor(new SedanCar());
        System.out.println(car1.assemble());

        Car car2 = new FourSeater(new BlackColor(new SportsCar()));
        System.out.println(car2.assemble());
    }
}
