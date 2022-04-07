package com.skillsoft.anonymous;

import java.util.*;

public class Main {

    private static List<Home> populateAndGetHomesList(){
        Home home1 = new Home("townhome", "Seattle", 2345, 100000);
        Home home2 = new Home("villa", "NY", 1500, 150000);
        Home home3 = new Home("condo", "Boston", 4000, 300000);

        List<Home> homesList=new ArrayList<>();

        homesList.add(home1);
        homesList.add(home2);
        homesList.add(home3);

        return homesList;
    }

    public static void main(String[] args) {

        class ComparisonUtility{

            public int comparePrice(Home o1, Home o2){
                return Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
            }
        }
/*        for(int i=0;i<homesList.size();i++){

            filter(()-> {
                        Home home = homesList.get(index);

                        index = (index + 1) % homesList.size();
                        return home;
                    },
                    home -> (home.getAreaSqFt()>2000 &&
                            home.getPrice()>100000),
                    home -> {
                        home.setCity(home.getCity().toUpperCase());
                        return home;
                    },
                    home -> System.out.println(home));

            }*/


        /*List<Home> homesList = populateAndGetHomesList();
        ComparisonUtility comparisonUtility = new ComparisonUtility();

        System.out.println("Original: \n" +homesList);

        homesList.sort(Home::compareTypes);

        System.out.println("Sorted: \n" + homesList);*/

        Supplier<Home> homeAnonymous=new Supplier<Home>() {
            @Override
            public Home get() {
                return new Home();
            }
        };

        System.out.println(homeAnonymous.get());

        Supplier<Home> lambdasSupplier=()->new Home();

        System.out.println(lambdasSupplier.get());

        Supplier<Home> referenceSupplier = Home::new;

        System.out.println(referenceSupplier.get());






/*
        System.out.println("Before sorting: " +homeList);

        Collections.sort(homeList, new Comparator<Home>() {
            @Override
            public int compare(Home o1, Home o2) {
                return o1.getAreaSqFt()-o2.getAreaSqFt();
            }
        });




        System.out.println("After sorting: \n" + homeList);

        class LocalThread extends Thread{
            public void run(){
                System.out.format("Current thread name: %s priority: %d\n",
                        Thread.currentThread().getName(),Thread.currentThread().getPriority());
            }
        }

        Thread thread = new LocalThread();
        thread.start();

        System.out.format("Current thread name: %s priority: %d\n",
                Thread.currentThread().getName(),Thread.currentThread().getPriority());
    }*/
    }



    private static List<Home> filterByPriceInRange(List<Home> homesList, int low, int high){
        List <Home> filteredList =new ArrayList<>();

        for(Home home : homesList){
            if(home.getPrice()>=low && home.getPrice()<high){
                filteredList.add(home);
            }
        }
        return filteredList;
    }

    private static List<Home> filterHome (List<Home> homesList, HomeFilter... homeFilters){

        List<Home> filteredList = new ArrayList<>();

        for(Home home : homesList){

            boolean allCriteriaApplicable=true;

            for(HomeFilter homeFilter : homeFilters){
                if(!homeFilter.test(home)){
                    allCriteriaApplicable=false;
                    break;
                }
            }
            if(allCriteriaApplicable){
                filteredList.add(home);
            }
        }
        return filteredList;
    }

    private static <T,R> void filter(Supplier<T>supplier,
                                     Predicate<T> filter,
                                     Function<T,R> function,
                                     Consumer<R> consumer
                                   ){

        T element = supplier.get();
                if(filter.test(element)){
                   R transformElement= function.apply(element);

                   consumer.accept(transformElement);
                }
        }

    }




