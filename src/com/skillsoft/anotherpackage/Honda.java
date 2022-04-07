package com.skillsoft.anotherpackage;

public class Honda implements Car{

    private String model;
    private int price;
    private int mileage;

    public Honda(String model,int price,int mileage){
        this.model=model;
        this.price=price;
        this.mileage=mileage;
    }

    @Override
    public String getMake(){
        return "Honda";
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getMileage() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Make: %s, model:%s, price:%d, mileage:%d",getMake(),getModel(),getPrice(),getMileage());
    }
}
