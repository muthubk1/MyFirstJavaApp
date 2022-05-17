package com.java.streams;

import com.java.streams.pojo.Trader;
import com.java.streams.pojo.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TradersTransactions {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> result1 = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("transc2011=>"+result1);
//What are all the unique cities where the traders work?
        Set<String> uniqueCities = transactions.stream()
                .map(f-> f.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println("uniqueCities=>"+uniqueCities);
// Find all traders from Cambridge and sort them by name.
        List<Trader> cambridgeTraders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(t-> t.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("cambridgeTraders=>"+cambridgeTraders);

        // Return a string of all traders’ names sorted alphabetically.
        //5. Are any traders based in Milan?
        //6. Print all transactions’ values from the traders living in Cambridge.
        //7. What’s the highest value of all the transactions?
        //8. Find the transaction with the smallest value.
    }
}
