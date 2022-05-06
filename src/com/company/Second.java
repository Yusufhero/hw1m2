package com.company;


import java.sql.SQLOutput;

public class Second extends Third {

    private Dog dog;
    private String name;
    private EColor color;


    public int getSum(int a, int b){
        return a+b;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    public EColor getColor() {
        return color;
    }

    public Second() {
    }

    public Second(Dog dog, String name, EColor color) {
        this.dog = dog;
        this.name = name;
        this.color = color;
    }


}
