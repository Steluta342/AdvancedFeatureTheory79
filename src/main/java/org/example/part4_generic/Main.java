package org.example.part4_generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // List<String>  strings = new ArrayList<>();
        //String[] stringArray = (String[]) strings.toArray();

        //Initializare si definire a unui obiect de tipul unei clase concrete
        Object tmp = new Object();

        //Initializare si definire a unui obiect de tipul unei interfete generice
        List<Integer> integerList = new ArrayList<>();

        //Initializare si definire a unui obiect de tipul unei clase generice
        Box<Integer> inBox = new Box<>(42, "numarul 42");
        Box<String> stringBox = new Box<>("HI", "World");
        Box<List<String>> liststringBox = new Box<>(
                List.of("alune", "seminte"),
                "Lista de cumparaturi"
        );

        System.out.println(inBox.getValue());
        System.out.println(stringBox.getValue());
        System.out.println(liststringBox.getValue());

        //Obiect de tipul unei clase generice cu parametri multipli
        Triplet<Box<String>, Integer, Map<String, Double>> triplet = new Triplet<>(
                new Box<>("text1", "text2"),
                56,
                Map.of(
                        "text", 45.2)
        );
        System.out.println(triplet);


    }
}
