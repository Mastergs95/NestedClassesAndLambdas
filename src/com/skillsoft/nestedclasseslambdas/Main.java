package com.skillsoft.nestedclasseslambdas;

import java.util.Iterator;

public class Main {
    public static void  main(String[]args){

       /*Shape triangle = new Shape("triangle","red", "glossy");
       Shape rectangle = new Shape("rectangle","green", "glossy");
       Shape circle = new Shape("circle","blue", "glossy");

       Shape.Brush triangleBrush = triangle.new Brush("shiny gold","matte");
       Shape.Brush rectangleBrush = rectangle.new Brush("shiny silver", "matte");
       Shape.Brush circleBrush = circle.new Brush("moon silver", "matte");

       triangleBrush.draw("Black", "leathery");
       rectangleBrush.draw("Black", "leathery");
       circleBrush.draw("Black", "leathery");*/

        //Shape.Brush anotherTriangleBrush = triangle.new Brush("yellow","mate");
        //anotherTriangleBrush.draw();

        /*StringContainer names= new StringContainer("Alice","Bob","Charles");

        Iterator<String> namesIterator = names.iterator();

        System.out.println("\nFirst element "+namesIterator.hasNext());
        System.out.println(namesIterator.next());

        System.out.println("\nSecond element "+namesIterator.hasNext());
        System.out.println(namesIterator.next());

        System.out.println("\nThird element "+namesIterator.hasNext());
        System.out.println(namesIterator.next());*/


        Customer jason = new Customer(1234,"Jason","212-345-1235, jason@gmail.com");

        System.out.println(jason);

        Customer mona = new Customer(1234,"Mona","2123451235, jason@gmail");

        System.out.println(mona);
    }
}
