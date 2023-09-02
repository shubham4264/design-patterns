package CarFactory;

import Car.Audi;
import Car.BMW;
import Car.Car;

public class LuxuryCarFactory implements CarFactory{

    @Override
    public Car getCar(String name) {
        if(name == "AUDI")
            return new Audi();
        if(name == "BMW")
            return new BMW();
        return null;
    }
}
