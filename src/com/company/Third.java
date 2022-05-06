package com.company;

public class Third {
    private Dog dog;
    private String name;
    private EColor color;

    public Dog getDog() {
        return dog;
    }

    public Third() {
    }

    public String getName() {
        return name;
    }

    public EColor getColor() {
        return color;
    }

    public Third(Dog dog, String name, EColor color) {
        this.dog = dog;
        this.name = name;
        this.color = color;
    }
}
