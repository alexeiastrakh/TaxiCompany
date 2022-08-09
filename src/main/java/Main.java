import com.solvd.taxiCompany.*;
import com.solvd.taxiCompany.enums.LicenseCategory;
import com.solvd.taxiCompany.exception.ZeroDistanceException;

import java.time.LocalDate;
import org.apache.log4j.Logger;


public class Main {

    public static void main(String[] args) throws ZeroDistanceException {

     CargoTaxi minivan = new CargoTaxi("Ford","Ford Galaxy",4615);
     Limousine limousine = new Limousine("Mercedes-benz","MERCEDES-BENZ S-600 PULLMAN",false,true);
     LightCar standard = new LightCar("Renault","Renault Logan",false);
     License license = new License(LocalDate.of(2011, 1, 8),
                LocalDate.of(2023, 1, 8),LicenseCategory.B);
        Driver driver = new Driver(license,"James","Bond");
        Dispatcher dispatcher = new Dispatcher("Magnus","Carlsen");
        Taxi taxi = new Taxi(limousine,driver);
        Passenger passenger = new Passenger("Cristiano","Ronaldo");
        Order order = new Order(passenger,"Khreshatyk 1","Vokzalnaya 1",56,dispatcher,taxi);

      order.setPrice();
      order.setDuration();


    }
}