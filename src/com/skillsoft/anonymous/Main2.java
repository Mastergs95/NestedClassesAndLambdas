package com.skillsoft.anonymous;

public class Main2 {

    public static void main(String[]args) {

        /*Greeting simpleGreetingAnonymous=new Greeting() {
            @Override
            public String simpleGreetingByName(String name) {
                return "Hello world "+name;
            }
        };
        Greeting simpleGreetingLambda = (name)->"Hello "+name;

        System.out.println(simpleGreetingAnonymous.simpleGreetingByName("Alice"));
        System.out.println(simpleGreetingLambda.simpleGreetingByName("bob"));

        Greeting simpleGreetingWithBlock=name -> {
            name=name.toUpperCase();
            return "Hi there " + name;
        };
        System.out.println(simpleGreetingWithBlock.simpleGreetingByName("Elise"));*/

        Greeting anonymousGreeting = new Greeting() {
            @Override
            public void simpleGreeting(String greeting) {
                System.out.println(greeting);
            }

            @Override
            public String toString() {
                return "String representation";
            }
        };

        Greeting lambdasExpressions = System.out::println;
        Greeting lambdasBlock = greeting -> System.out.println(greeting);

        System.out.println(anonymousGreeting);

        greet("Wish you a good day",anonymousGreeting);


        anonymousGreeting.anotherGreeting();
        anonymousGreeting.oneMoreGreeting();



    }
    private static void greet(String message,Greeting greeting){
        greeting.simpleGreeting(message);
    }
}
