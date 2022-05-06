package com.company;

public class First extends Second {

    public String getName() {
        return name;
    }

    @Override
    public int getSum(int a, int b) {
        return super.getSum(a, b);
    }

    public Dog getDog() {
        return dog;
    }

    public EColor getColor() {
        return color;
    }

    public First(String name, Dog dog, EColor color) {
        this.name = name;
        this.dog = dog;
        this.color = color;
    }

    public First() {
    }

    private String name;
    private Dog dog;
    private EColor color;



}
