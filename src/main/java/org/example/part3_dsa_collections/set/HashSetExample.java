package org.example.part3_dsa_collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();
        users.add("Ana");
        users.add("are");
        users.add("mere");
        users.add(".");

        System.out.println(users);
        //[Ana, are, mere, .]
        System.out.println("\n-------------------");

        users.add("mere");//nu se arunca exceptii in situatia in care se introduc valori existente
        users.add("null");//poate exista in HashSet/LinkedList, dar nu poate exista in TreeSet

        System.out.println(users);
        //[null, Ana, are, mere, .]
        System.out.println("\n-------------------");

        Set<String> words = new HashSet<>();
        words.addAll(Set.of("Ion", "mancare", "Ana", "caine", "."));
        users.retainAll(words);//face intersectia valorilor comune
        for (String it : users) {
            System.out.print(it + " ");
        }
        System.out.println("\n-------------------");

        System.out.println(displayUniqueValues(List.of(1, 2, 2, 68, 2, 4, 4, 5, 5, 8, 9, 6, 3, 2, 1, 7)));
        System.out.println(displayDuplicateValues(List.of(1, 7, 2, 68, 3, 4, 4, 8, 5, 8, 5, 6, 3, 2, 1, 7)));

    }

    private static List<Integer> displayDuplicateValues(List<Integer> numbers) {
        List<Integer> duplicateExcessNumbers = new ArrayList<>();
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (Integer it : numbers) {
            if (uniqueNumbers.contains(it)) {
                duplicateExcessNumbers.add(it);

            } else {
                uniqueNumbers.add(it);
            }
        }
        return duplicateExcessNumbers;

    }

    /*
     Algoritm de verificare a unicitatii foflosind liste:

     numbers = {1,2,3,4,4,5,6,7,8,9,4,4,4,1,2}
     uniqueNumbers = {}
     for i = 0, numbers.size, i++
       if (!uniqueNumbers.contains(numbers.get(i)))
               continue;
          else
                  uniqueNumbers.add(numbers.get(i))
     print uniqueNumbers
     */

    //todo: implementati un algoritm de verificare a frecventei elementelor folosind Map
    private static Set<Integer> displayUniqueValues(List<Integer> numbers) {
        Set<Integer> resultUniqueValues = new HashSet<>(numbers);
        return resultUniqueValues;
        //return new HasSet<> (numbers)

    }


}
