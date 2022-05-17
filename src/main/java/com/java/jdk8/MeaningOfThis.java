package com.java.jdk8;

public class MeaningOfThis {

    private final int value = 4;
    private void doIt(){
        int value = 6;
        Runnable r = new Runnable() {

            int value = 5;
            public void run(){
                int value =10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String[] args) {

        MeaningOfThis meaningValue = new MeaningOfThis();
        meaningValue.doIt();
    }
}
