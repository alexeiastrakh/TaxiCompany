package com.solvd.taxiCompany;

public class Limousine extends Car{


    private boolean bar;
    private boolean TV;

    public Limousine() {
    }

    public Limousine(int capacity, String engineType, boolean TV,boolean bar) {
        super(capacity);
        this.TV = TV;
        this.bar = bar;
    }
    public boolean isTV() {
        return TV;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }



    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }
}
