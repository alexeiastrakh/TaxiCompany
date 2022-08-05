package com.solvd.taxiCompany.enums;

public enum LicenseCategory {
    A("Motorcycles"),
    B("Cars, small trucks"),
    C("Trucks"),
    D("Buses"),
    M("Mopeds");
    private final String value;

    LicenseCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;

    }
}
