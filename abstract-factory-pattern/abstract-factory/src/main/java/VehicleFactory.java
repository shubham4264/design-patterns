import CarFactory.CarFactory;
import CarFactory.LuxuryCarFactory;
import CarFactory.SUVCarFactory;

public class VehicleFactory {

    CarFactory getCarFactory(String carType){
        if(carType == "Luxury")
            return new LuxuryCarFactory();
        if(carType == "SUV")
            return  new SUVCarFactory();
        return null;
    }
}
