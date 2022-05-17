package com.java.initblock;

public class Parent {

    {
        System.out.println("Parent init block 1");
    }
    static {
        System.out.println("Parent static block 1");
    }

    public Parent(){
        System.out.println("Parent constructor 1");
    }

    {
        System.out.println("Parent init block 2");
    }
    static {
        System.out.println("Parent static block 2");
    }

}
