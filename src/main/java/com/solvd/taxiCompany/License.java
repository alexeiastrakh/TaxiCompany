package com.solvd.taxiCompany;

import java.time.LocalDate;
import com.solvd.taxiCompany.enums.LicenseCategory;

public class License {

    private LocalDate dateFrom;
    private LocalDate validUntil;

    private String description;



    private LicenseCategory licenseCategory;


    public License() {
    }

    public License(LocalDate dateFrom, LocalDate validUntil,LicenseCategory licenseCategory) {
        this.dateFrom = dateFrom;
        this.validUntil = validUntil;
        this.licenseCategory = licenseCategory;
    }



    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateFrom() {
        return this.dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.validUntil = dateTo;
    }

    public LocalDate getDateTo() {
        return this.validUntil;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public LicenseCategory getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(LicenseCategory licenseCategory) {
        this.licenseCategory = licenseCategory;
    }
}