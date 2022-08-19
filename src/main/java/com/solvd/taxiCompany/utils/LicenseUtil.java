package com.solvd.taxiCompany.utils;

import com.solvd.taxiCompany.Driver;
import com.solvd.taxiCompany.License;
import com.solvd.taxiCompany.enums.LicenseCategory;

import java.time.LocalDate;
import java.util.ArrayList;

public class LicenseUtil {
    public static ArrayList<License> createLicences() {
        ArrayList<License> licenses = new ArrayList<>();
        License license = new License(LocalDate.of(2011, 1, 8),
                LocalDate.of(2023, 1, 8), LicenseCategory.B);
        License license1 = new License(LocalDate.of(2001, 1, 8),
                LocalDate.of(2022, 3, 5),LicenseCategory.B);
        License license2 = new License(LocalDate.of(2017, 3, 6),
                LocalDate.of(2024, 2, 0),LicenseCategory.B);
        licenses.add(license);
        licenses.add(license1);
        licenses.add(license2);

        return licenses;
    }


    }

