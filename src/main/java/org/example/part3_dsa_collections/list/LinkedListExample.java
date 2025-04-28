package org.example.part3_dsa_collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> books = new LinkedList<>();

        books.add("Book 1");
        books.add("Book 2");

        System.out.println("\n--------------");

        for (String it: books) {
            System.out.print(it + " ");
        }

        System.out.println("\n--------------");
        ListIterator<String> nextlistIterator = books.listIterator();
                while(nextlistIterator.hasNext()){
                    System.out.print(nextlistIterator.next() + " ");
                }

        System.out.println("\n--------------");

        ListIterator<String> prevlistIterator = books.listIterator();
        while(prevlistIterator.hasPrevious()){
            System.out.print(prevlistIterator.previous() + " ");
        }
    }
}
