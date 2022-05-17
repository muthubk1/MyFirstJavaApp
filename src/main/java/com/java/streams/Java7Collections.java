package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java7Collections {

    public static void main(String[] args) {

        List<Dish> lowCaloricDishes = new ArrayList<>();
        List<Dish> menu = Arrays.asList(
                new Dish("pork", 800),
                new Dish("beef", 700),
                new Dish("chicken", 400),
                new Dish("french fries", 530),
                new Dish("rice", 350),
                new Dish("season fruit", 120),
                new Dish("pizza", 550),
                new Dish("prawns", 300),
                new Dish("salmon", 450) );

        for(Dish d : menu){

        }

    }
}
