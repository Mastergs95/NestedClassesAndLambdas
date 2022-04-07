package com.skillsoft.anotherpackage;

public class Condo implements Home{

    public String city;
    public String architecturalStyle;
    public int price;

    public Condo(String city,String architecturalStyle, int price){
        this.city=city;
        this.architecturalStyle=architecturalStyle;
        this.price=price;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getNumberOfFloors() {
        return 0;
    }

    @Override
    public String getArchitecturalStyle() {
        return architecturalStyle;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("City: %s, Number of Floors: %s, styles: %s, price: %d",
                getCity(),getNumberOfFloors(),getArchitecturalStyle(),getPrice());
    }
}
