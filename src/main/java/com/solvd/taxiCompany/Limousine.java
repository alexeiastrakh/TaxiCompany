package com.solvd.taxiCompany;

public class Limousine extends Car{


    private boolean bar;
    private boolean TV;

    public Limousine() {
    }

    public Limousine(String brand, String model, boolean bar,boolean TV) {
        super(brand, model);
        this.bar = bar;
        this.TV = TV;
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

    @Override
    public String toString() {
        return "Limousine{" +getBrand()+getModel()+
                "bar=" + bar +
                ", TV=" + TV +
                '}';
    }
}
