package CarFactory;

import Car.Fortuner;
import Car.Car;
import Car.XUV;

public class SUVCarFactory implements CarFactory{

    @Override
    public Car getCar(String name) {
        if(name == "XUV")
            return new XUV();
        if(name == "FORTUNER")
            return new Fortuner();
        return null;
    }
}
