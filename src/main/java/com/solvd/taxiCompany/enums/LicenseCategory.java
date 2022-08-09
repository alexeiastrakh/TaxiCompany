package com.solvd.taxiCompany.enums;

public enum LicenseCategory {
    A("Motorcycles"),
    B("Cars, small trucks"),
    C("Trucks"),
    D("Buses"),
    M("Mopeds");
    private final String licenseCategory;

    LicenseCategory(String value) {
        this.licenseCategory = value;
    }

    public String getLicenseCategory() {
        return licenseCategory;

    }
}
