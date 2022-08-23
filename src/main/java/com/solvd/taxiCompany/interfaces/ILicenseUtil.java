package com.solvd.taxiCompany.interfaces;

import com.solvd.taxiCompany.License;

import java.util.ArrayList;

@FunctionalInterface
public interface ILicenseUtil {
    public ArrayList<License> sortLicenseByDate(ArrayList<License> licenses);
}
