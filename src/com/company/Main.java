package com.company;

public class Main {

    public static void main(String[] args) {

        Second second = new Second();

        First first = new First();

        First first1 = new First();

        System.out.println(second.getName()+second.getColor()+second.getDog());

        System.out.println(first.getColor() + first.getName()+first.getDog());

        System.out.println(first1.getColor() + first1.getName()+first1.getDog());

        second.getSum(5, 7);

        first.getSum(3,9);

        first1.getSum(2,8);
    }
}
