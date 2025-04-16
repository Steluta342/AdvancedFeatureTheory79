package org.example.part1_class_types;

import org.example.part1_class_types.class_abstract.AbstractAnimal;
import org.example.part1_class_types.class_abstract.Bird;
import org.example.part1_class_types.class_abstract.Dog;
import org.example.part1_class_types.class_enum.AccessRole;
import org.example.part1_class_types.class_enum.Day;
import org.example.part1_class_types.class_final.BankAcount;
import org.example.part1_class_types.class_final.MathUtils;
import org.example.part1_class_types.class_interface.Crocodile;
import org.example.part1_class_types.class_interface.InterfaceAnimal;
import org.example.part1_class_types.class_interface.Parrot;
import org.example.part1_class_types.class_object_concrete.ConcreteAnimal;
import org.example.part1_class_types.multiple_inheritance.ElectricCar;

public class Main {
    public static void main(String[] args) {
        /* Clasa de obiect / Clasa concreta */
        ConcreteAnimal concreteAnimalObject1 = new ConcreteAnimal();
        concreteAnimalObject1.setVarsta(3);
        concreteAnimalObject1.setRasa("Pisica");
        ConcreteAnimal concreteAnimalObject2 = new ConcreteAnimal("caine", 2);
        System.out.println(concreteAnimalObject1);
        System.out.println(concreteAnimalObject2 + "\n");


        System.out.println("Afisari ale unei clase abstracte (parent class) si a claselor mostenite (sub-classes):");
        Dog dogObject = new Dog();
        dogObject.eat();
        dogObject.makeSound();
        Bird birdObject = new Bird();
        birdObject.eat();
        birdObject.makeSound();
        System.out.println();

        /* Interface (Interfata) */
        System.out.println("Afisari din interfata si clase de implementare");
        InterfaceAnimal animalObject1 = new Crocodile();
        //e relevant in cazul in care avem o relatie unica de implementare
        //o unica interfata este implementata de o clasa de implementare
        //o clasa de implementare implementeaza o SINGURA interfata unica
        Crocodile crocodileObject = new Crocodile();
        animalObject1.doSound();
        crocodileObject.doSound();

        InterfaceAnimal animalObject2 = new Parrot();
        Parrot parrotObject = new Parrot();
        animalObject2.doSound();
        parrotObject.doSound();
        System.out.println();

        /* Multiple Inheritance */
        ElectricCar electricCar = new ElectricCar("Opel", "Astra", 2020, 93, 500);
        electricCar.displayStatus();
        electricCar.chargeBaterry();
        electricCar.navigateTo("Suceava");

        /* Class final */
        System.out.println();
        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.CONSTANT_TEXT);
        //mathUtils.CONSTANT_TEXT = "Alune" -> nu merge asignat
        //mathUtils.MAX_VALUE= 98 -> nu merge asignata valoarea la o variabila finala

        BankAcount bankAcount = new BankAcount("124743");
        bankAcount.display();

        /* Enum CALSS */
        System.out.println("Enum CALSS");
        Day dayOne = Day.LUNI;
        Day dayThree = Day.MIERCURI;
        Day daySix = Day.SAMBATA;
        System.out.println(dayOne + " " + dayOne.ordinal());
        System.out.println(dayThree + " " + dayThree.ordinal());
        System.out.println(daySix + " " + daySix.ordinal());

        AccessRole newRole = AccessRole.ADMIN;
        System.out.println(newRole.getPriority() + " " + newRole.getAcessLevel());

        //AccessRole otherRole = new AccessRole("wow", 0); //Utilizati final class, altfel primiti  pre compile error

    }
}
