package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<String> words1  = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("words1=>"+words1);
    }
}
