package com.java.strings;

public class ReverseWord {

    //https://leetcode.com/problems/reverse-words-in-a-string/
   private static String makeAbba(String a, String b){

       String []sArr = {a, b};
       System.out.print(sArr[0]+sArr[1]);
       System.out.print(sArr[1]+sArr[0]);
       System.out.println();
        return null;
   }

   public static void main(String[] args) {

       makeAbba("Hi", "Bye");
       makeAbba("Yo", "Alice");
       makeAbba("What", "Up") ;
    }
}
