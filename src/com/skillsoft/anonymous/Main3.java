package com.skillsoft.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[]args){

        List<String> writers = Arrays.asList("Ernest", "J.K Rowling", "Nakamura");

        writers.sort(String::compareToIgnoreCase);

        System.out.println(writers);
    }
}
