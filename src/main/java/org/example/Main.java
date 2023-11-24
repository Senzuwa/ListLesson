package org.example;

import java.util.ArrayList;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> trump = new ArrayList<>();
        trump.add("Ace");
        trump.add("Ten");
        trump.add("Jack");
        trump.add("Queen");
        trump.add("King");

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