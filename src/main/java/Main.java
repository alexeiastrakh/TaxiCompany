import com.solvd.taxiCompany.*;
import com.solvd.taxiCompany.enums.LicenseCategory;
import com.solvd.taxiCompany.exception.ZeroDistanceException;

import java.time.LocalDate;
import java.util.Scanner;

import com.solvd.taxiCompany.utils.*;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;


public class Main {

    public static void main(String[] args) throws ZeroDistanceException {
        Scanner scanner = new Scanner(System.in);
        Passenger passenger = PassengerUtil.createPassengers().get(0);
        Dispatcher dispatcher= DispatcherUtil.createDispatchers().get(0);
        Taxi taxi = TaxiUtil.createTaxi().get(0);
        String destination = scanner.nextLine();
        if(StringUtils.isEmpty(destination)) { throw new IllegalArgumentException("Destination cannot be empty");}
        String startPoint=scanner.nextLine();
        if(StringUtils.isEmpty(startPoint)) { throw new IllegalArgumentException("Start point cannot be empty");}
        double distance = RandomUtils.nextDouble(10.0, 300.0);
        dispatcher.CalculateDuration(taxi.getCar(), distance);
        dispatcher.CalculatePrice(taxi.getCar(), distance);





    }
}