package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> trump = new ArrayList<>();
        trump.add("King");
        trump.add("Ten");
        trump.add("Jack");
        trump.add("Queen");
        trump.add("Ace");

        System.out.print(trump.size());
        System.out.print(" ");
        System.out.print(trump.get(0).replace("¥r¥n", ""));
        System.out.print(" ");
        System.out.print(trump.get(4).replace("¥r¥n", ""));
        System.out.print(" ");
        System.out.print(trump.get(3).replace("¥r¥n", ""));
        System.out.print(" ");
        System.out.print(trump.get(2).replace("¥r¥n", ""));
        System.out.print(" ");
        System.out.print(trump.get(1).replace("¥r¥n", ""));


    }
}