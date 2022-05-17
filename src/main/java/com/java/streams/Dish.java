package com.java.streams;

public class Dish {

    private int calories;
    private String name;

    public Dish(String name, int calories){
        this.calories = calories;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
