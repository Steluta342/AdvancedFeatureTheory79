package org.example.part1_class_types.class_abstract;

/*
 * Ce este o clasa abstracta?
 * O clasa abstarcata - nu poate insatntia un obiect sau nu poate contine metode abstracte
 * O metoda abstracta - se defineste prin semnatura fara a avea un bloc de cod
 *
 *  Cand folosim?
 *  - cand construim o clasa de baza (clasa parinte) care stocheaza o serie de functionalitati generice ,
 * menite a fi implementate in mod specific in clasele copil
 *  - clasele abstracte prin relata de mostenire forteaza clasele/(sub clasele) copil
 * sa implementeze metodele abstracte
 *  - in mod automat, se creeaza o ierarhie intre clase -> LAYER de ABSTRACTIZARE
 *
 * Scenarii comune:
 *      - o clasa abstacta poate fi o clasa parinte pentru o serie de tabele care
 * stocheaza o cheie primara, si strategia de indexare in baza de date relaltionala
 *      - in game development, o clasa parinte abstracta poate fi o clasa care
 * defineste o categorie de personaje
 *      - template pattern in OOP
 *      -
 *
 * */
public abstract class AbstractAnimal {
    public abstract void makeSound();

    public void eat() {
        System.out.println("Animalul mananca ...");
    }


}
