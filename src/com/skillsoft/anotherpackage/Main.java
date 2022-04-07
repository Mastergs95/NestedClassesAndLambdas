package com.skillsoft.anotherpackage;

import com.skillsoft.nestedclasseslambdas.Product;

import java.util.Objects;

public class Main {
    private static void displayCar(Car car){

        System.out.println("Display car");
        System.out.println(car);
    }

    private static void displayHome(Home home){

        System.out.println("Display home");
        System.out.println(home);
    }

    public static void main(String[]args){
        /*Honda civic=new Honda("Civic",28000,25);
        Honda city = new Honda ("City",21000,26);

        displayCar(civic);
        displayCar(city);

        Condo myCondo = new Condo("New york","modern",100000);
        Condo mumbaiCondo = new Condo("Mumbai","regency",500000);

        displayHome(myCondo);
        displayHome(mumbaiCondo);*/


        //Car AnonymousClass

        Car camry = new Car(){
            @Override
            public String getMake() {
                return "Toyota";
            }

            @Override
            public String getModel() {
                return "Camry";
            }

            @Override
            public int getPrice() {
                return 20000;
            }

            @Override
            public int getMileage() {
                return 24;
            }

            @Override
            public String toString() {
                return String.format("Make: %s, model:%s, price:%d, mileage:%d",
                        getMake(),getModel(),getPrice(),getMileage());
            }

            @Override
            public boolean equals(Object other) {
                if(other == null){
                    return false;
                }

                if(!(other instanceof Car)){
                    return false;
                }
                Car otherCar = (Car) other;

                if(otherCar.getMake().equals(getMake())&&
                        otherCar.getModel().equals(getModel())&&
                        otherCar.getPrice()==getPrice()&&
                        otherCar.getMileage()==getMileage()){
                    return true;
                }
                return false;
            }

            @Override
            public int hashCode() {
                return Objects.hash(getMake(),getModel(),getPrice(),getMileage());
            }
        };

        Car lamborghini = new Car(){

            String make="Lamborghini";
            String model="Aventador";
            int price=20000;
            int mileage=14;

            @Override
            public String getMake() {
                return "lamborghini";
            }

            @Override
            public String getModel() {
                return "Aventator";
            }

            @Override
            public int getPrice() {
                return 100000;
            }

            @Override
            public int getMileage() {
                return 26;
            }

            @Override
            public String toString() {
                return String.format("Make: %s, model:%s, price:%d, mileage:%d",
                        this.make,this.model,this.price,this.mileage);
            }

            @Override
            public boolean equals(Object other) {
                if(other == null){
                    return false;
                }

                if(!(other instanceof Car)){
                    return false;
                }
                Car otherCar = (Car) other;

                if(otherCar.getMake().equals(getMake())&&
                        otherCar.getModel().equals(getModel())&&
                        otherCar.getPrice()==getPrice()&&
                        otherCar.getMileage()==getMileage()){
                    return true;
                }
                return false;
            }

            @Override
            public int hashCode() {
                return Objects.hash(getMake(),getModel(),getPrice(),getMileage());
            }
        };



        displayCar(camry);
        displayCar(lamborghini);

        System.out.println("lamborghini.equals(camry): " + lamborghini.equals(camry));



        //Home AnonymousClass

        Home townHome=new Home() {
            @Override
            public String getCity() {
                return "Palo ALto";
            }

            @Override
            public int getNumberOfFloors() {
                return 2;
            }

            @Override
            public String getArchitecturalStyle() {
                return "Tudor";
            }

            @Override
            public int getPrice() {
                return 765000;
            }

            @Override
            public String toString() {
                return String.format("City: %s, Number of Floors: %s, styles: %s, price: %d",
                        getCity(),getNumberOfFloors(),getArchitecturalStyle(),getPrice());
            }

        };

        System.out.println();
        System.out.println(townHome.getCity());
        System.out.println(townHome.getNumberOfFloors());
        System.out.println(townHome.getArchitecturalStyle());
        System.out.println(townHome.getPrice());

        displayHome(townHome);

        Condo condo = new Condo("Boston","Victorian",678000){
            @Override
            public String getArchitecturalStyle() {
                return "Gothic";
            }
        };

        Honda honda = new Honda("Acura",3400,24){
            @Override
            public int getPrice() {
                return 30000;
            }
        };

        System.out.println(condo);
        System.out.println(honda);

    }


}
