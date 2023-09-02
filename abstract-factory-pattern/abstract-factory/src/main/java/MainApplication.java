import Car.Car;
import CarFactory.CarFactory;

public class MainApplication {

    public static void main(String[] args){

        VehicleFactory vehicleFactory = new VehicleFactory();
        CarFactory carFactory = vehicleFactory.getCarFactory("SUV");
        Car car =  carFactory.getCar("XUV");
        Car car2 = carFactory.getCar("FORTUNER");
        System.out.println(car.average());
        System.out.println(car2.average());

        CarFactory carFactory1 = vehicleFactory.getCarFactory("Luxury");
        Car car1 = carFactory1.getCar("AUDI");
        System.out.println(car1.average());

    }
}
