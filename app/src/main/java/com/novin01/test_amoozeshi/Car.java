package com.novin01.test_amoozeshi;

public class Car {

    private String color;
    private int model;
    private String brand;



    public Car(String color, int model, String brand) {
        this.color = color;
        this.model = model;
        this.brand = brand;
    }

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
