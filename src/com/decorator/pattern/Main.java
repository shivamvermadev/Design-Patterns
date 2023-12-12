package com.decorator.pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ExtraMushroom(new Margherita()).cost());
        System.out.println(new ExtraCheese(new ExtraCheese(new ExtraMushroom(new Margherita()))).cost());
    }
}
