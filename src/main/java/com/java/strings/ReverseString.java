package com.java.strings;

public class ReverseString {

    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0;i--){
            if(!words[i].isEmpty()){
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

       String str = reverseWords("this is my world");
    }

}
