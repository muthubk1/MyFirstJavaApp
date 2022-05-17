package com.java.initblock;

public class Child extends Parent {

    {
        System.out.println("Child init block 1");
    }

    static {
        System.out.println("Child static block 1");
    }

    public Child(){
        System.out.println("Child constructor 1");
    }

    {
        System.out.println("Child init block 2");
    }

    static {
        System.out.println("Child static block 2");
    }
}
