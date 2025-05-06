package org.example.part3_dsa_collections.map.frequency;

import java.util.*;

/*
Map<String, int> map =new HashMap<>();
 Accepta doar clase de tipul Object sau descendenti ai acesteia

 */
/*
Avem o lista de cuvinte, afisati afrecventa aparitiei aparitiei cuvintelor:

Input:
    List = {"apple", "bannana", "apple", "orange", "bannana", "apple"}
    SAU
    List = String.split(" ")
 Output:
    apple -> 3
    bannana -> 2
    orange -> 1
 */
public class WorldFrequency {
    public static void main(String[] args) {
        //Metoda 1: Apelarea mapei de frecventa a aparitiei cuvintelor in lista
        List<String> cuvinte = new ArrayList<>(List.of("apple", "bannana", "apple", "orange", "bannana", "apple"));
        Map<String, Integer> freqCuvinte = new HashMap<>();

        for (String it : cuvinte) {
            if (freqCuvinte.containsKey(it)) {
                //True - > a fost identificata cheia in mapa, prin urmare se incrementeaza nr de aparitiilor
                freqCuvinte.put(it, freqCuvinte.get(it) + 1);
            } else {
                //False -> nu a fost identificata cheia in mapa, prin urmare se adauga o noua pereche cu valoarea 1
                freqCuvinte.put(it, 1);
            }
        }
        System.out.println(freqCuvinte + "\n----------------------------------");

        //Metoda 2: idem cerinta, insa o singura linie de cod
        freqCuvinte.clear();//va sterge toate perechile din mapa
        System.out.println("Mapa are dimensiunea: " + freqCuvinte.size());

        for (String it : cuvinte) {
            freqCuvinte.put(it,freqCuvinte.getOrDefault(it, 0) + 1);

        }
        System.out.println(freqCuvinte + "\n----------------------------------");

        //Metoda 1: Sortare alfabetica / crecatoare / lexicografica a MAPEI dupa cheia String
        SortedMap<String, Integer> sortedFreqCuvinte = new TreeMap<>(freqCuvinte);
        //Valabil si la nivel de set de clase simple: String, Integer, Float, Double, Character etc..
        System.out.println(sortedFreqCuvinte + "\n----------------------------------");


        //Metoda 2: Sortare alfabetica / crecatoare / lexicografica a MAPEI dupa cheia String
        TreeMap<String, Integer> descendingFreqCuvinte = new TreeMap<>(
                Comparator.comparingInt(String::length)
                        //sortam crescator dupa lungimeea cuvantului
                        .reversed()
                        //inversam ordinea elem in mapa, a.i. sa fie descrescatoare
                        .thenComparing(Comparator.naturalOrder())
                        //daca lungimile a 2 cuvinte sunt egale, sortam dupa regula naturala
                       // - > ordinea intoducerii datelor in map
                        // in situatia unei clase de obiect, putem avea thenComparing
                        // o alta regula de sortare bazata pe alte atribute din clasa
        );
        descendingFreqCuvinte.putAll(freqCuvinte);
        System.out.println(descendingFreqCuvinte + "\n----------------------------------");




    }
}
