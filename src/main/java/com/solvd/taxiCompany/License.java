package com.solvd.taxiCompany;

import com.solvd.taxiCompany.enums.LicenseCategory;

import java.time.LocalDate;

public class License {

    private LocalDate dateFrom;
    private LocalDate validUntil;

    private String description;
    private LicenseCategory licenseCategory;


    public License() {
    }

    public License(LocalDate dateFrom, LocalDate validUntil) {
        this.dateFrom = dateFrom;
        this.validUntil = validUntil;
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
}