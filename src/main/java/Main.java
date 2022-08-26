import com.solvd.taxiCompany.*;
import com.solvd.taxiCompany.exception.ZeroDistanceException;

import java.time.LocalDate;
import java.util.Scanner;

import com.solvd.taxiCompany.utils.*;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;


public class Main {
    public static void main(String[] args) throws ZeroDistanceException {
      /*  Scanner scanner = new Scanner(System.in);
        Passenger passenger = PassengerUtil.createPassengers().get(0);
        Dispatcher dispatcher= DispatcherUtil.createDispatchers().get(0);
        Taxi taxi = TaxiUtil.createTaxi().get(0);
        String destination = scanner.nextLine();
        dispatcher.isEmpty(destination);
        String startPoint=scanner.nextLine();
        dispatcher.isEmpty(startPoint);
        double distance = RandomUtils.nextDouble(10.0, 300.0);
        dispatcher.CalculateDuration(taxi.getCar(), distance);
        dispatcher.CalculatePrice(taxi.getCar(), distance); */
        UncarriedPassengers uncarriedPassengers = new UncarriedPassengers();
        Thread taxiForPassengers = new Thread(uncarriedPassengers, "Taxi-1");
        Thread taxiForPassengers1 = new Thread(uncarriedPassengers, "Taxi-2");
        Thread taxiForPassengers2 = new Thread(uncarriedPassengers, "Taxi-3");
        taxiForPassengers.start();
        taxiForPassengers1.start();
        taxiForPassengers2.start();
        TaxiDriver taxiDriver1 = new TaxiDriver("TARAS");
        TaxiDriver taxiDriver2 = new TaxiDriver( "STEPAN");
        Thread thread1 = new Thread(() -> taxiDriver1.tookPassengers(taxiDriver2));
        Thread thread2 = new Thread(() -> taxiDriver2.tookPassengers(taxiDriver1));
        thread1.start();
        thread2.start();
    }
}