package org.example.part3_dsa_collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//CRUD - create, read, update, delete - de avut in vedere la algoritmii iterativi pe arrays
//Insertia - presupun SHIFTAREA la DREAPTA prin incrementarea dimrnsiunii cu nr de pozitii shiftuite

//Stergerea presupune SHIFTAREA la STANGA prin decrementarea dimrnsiunii cu nr de pozitii shiftuite

//Inversareaa-> creaarea unei noi struct de datae pornind de la ultimul elem al struct originale
//HINT: for i = (size - 1, >= 0, i--) -> addd in lista
//HINT: for mirror pana la size/2 ->
// aux = elementul 1,
// elementul 1 = elementul size -1,
//elementul size - 1 = aux

public class ArrayListExample {
    //Putem defini o structura de date fie dupa Interfata implementata, fie dupa clasa de implementare
    //atata timp cat initializarea se face folosind MEREU constructorul clasei de mplementare
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        names.add("Nume 1");
        names.add("Nume 2");
        names.add("Nume 3");
        names.add("Nume 4");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");

        }
        System.out.println("\n------------");

        names.addAll(List.of("Nume 5", " Nume 6"));
        names.addAll(2, List.of("Nume 7", "Nume 8"));


        for (String it: names) {
            System.out.print(it + " ");

        }

        System.out.println("\n------------");

        names.remove("Nume 3");
        names.remove(5);
        names.removeAll(List.of("Nume 2, Nume 7"));
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n------------");
        List<String> reversedNames = names.reversed();
        //reversed creeaza o noua lista cu elem inversate
        //astfel incat lista originala ramane neschimbata
        names.reversed();
        System.out.println(names);
        System.out.println(reversedNames.reversed());






    }
}
