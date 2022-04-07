package com.skillsoft.anonymous;

@FunctionalInterface
public interface Greeting {

     void simpleGreeting(String greeting);

     default void anotherGreeting(){
         System.out.println("Default greeting!");
     }

     default void oneMoreGreeting(){
         System.out.println("Static hello greeting");
     }
}
