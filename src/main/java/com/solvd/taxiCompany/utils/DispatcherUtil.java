package com.solvd.taxiCompany.utils;

import java.util.ArrayList;
import com.solvd.taxiCompany.Dispatcher;


public class DispatcherUtil {
    public static ArrayList<Dispatcher> createDispatchers() {
        ArrayList<Dispatcher> dispatchers = new ArrayList<>();
        Dispatcher dispatcher = new Dispatcher("Magnus","Carlsen");
        Dispatcher dispatcher1 = new Dispatcher("Taras","Shevchenko");
       dispatchers.add(dispatcher);
       dispatchers.add(dispatcher1);
        return dispatchers;
    }
}
