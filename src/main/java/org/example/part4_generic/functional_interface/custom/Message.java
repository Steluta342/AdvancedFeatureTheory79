package org.example.part4_generic.functional_interface.custom;

/*
    Functional Interfaces:
        - este o simpla interfata java cu exact o singura metoda abstracta
        - putem avea mai multe metode default sau statice, insa mereu una singura abstracta
        - metoda abstracta pe care o definim devine target al tipului de explresie lambda (neparametrizata / parametrizata)
        - atat metodele default, cat si cele statice sa aiba un corp de implementare
        - interfateel functionale sunt marcate de @FunctionalInterface

       Functional Interfaces pot functiona cu sau fara implementari generice
       Asociere prieteneasca: (INPUT) -> {OUTPUT}
            - INPUT: reprezinta argumentele metodei
            - OUTPUT: reprezinta rezultatul in urma metodei
                        -- void
                        -- returnabil

       Expresie lambda generica: (<iteratori>) -> {}
       Nu e nevoie sa utilizam keywordul return IN CAZUL IN CARE implementeaza este un one-liner,
        insa, daca implementarea e mai complexa e nevoie de {} si de return

        Totodata,rezultatul  MEREU trebuie sa fie de tipul de date al metodei
       Putem discuta despre 2 categorii de interfete functionale , raportate la nr metodelor abstracte:
        - metode neparametrizate:
        - metode parametrizate:
 */

@FunctionalInterface
public interface Message {
    String display();

    static String display2() {
        return "Hello!";

    }


}
