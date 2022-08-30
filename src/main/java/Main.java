import java.util.Scanner;

import com.solvd.taxiCompany.exception.ZeroDistanceException;
import com.solvd.taxiCompany.utils.DispatcherUtil;
import com.solvd.taxiCompany.utils.TaxiUtil;
import com.solvd.taxiCompany.*;


import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Main {
    public static void main(String[] args) throws ZeroDistanceException {
        final Logger LOGGER = LogManager.getLogger(Order.class);
        Scanner scanner = new Scanner(System.in);
        Dispatcher dispatcher = DispatcherUtil.createDispatchers().get(0);
        LOGGER.info("Choose car , press 1 if you want cargo taxi, press 2 if you want limousine, press 3 if you want light car");
        int carType = scanner.nextInt();
        Taxi taxi = null;
        switch (carType) {
            case (1):
                taxi = TaxiUtil.createTaxi().get(0);
                break;
            case (2):
                taxi = TaxiUtil.createTaxi().get(1);
                break;
            case (3):
                taxi = TaxiUtil.createTaxi().get(2);
                break;
        }
        String destination = scanner.nextLine();
        dispatcher.isEmpty(destination);
        LOGGER.info(destination);
        String startPoint = scanner.nextLine();
        dispatcher.isEmpty(startPoint);
        LOGGER.info(startPoint);
        double distance = RandomUtils.nextDouble(10.0, 300.0);
        LOGGER.info("Trip duration:");
        LOGGER.info(dispatcher.CalculateDuration(taxi.getCar(), distance, carType));
        LOGGER.info("Trip price:");
        LOGGER.info(dispatcher.CalculatePrice(taxi.getCar(), distance, carType));


    }
}