package com.solvd.taxiCompany.utils;

import com.solvd.taxiCompany.Dispatcher;
import com.solvd.taxiCompany.Driver;

import java.util.ArrayList;

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
