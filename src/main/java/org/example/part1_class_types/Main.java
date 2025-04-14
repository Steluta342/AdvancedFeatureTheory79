package org.example.part1_class_types;

import org.example.part1_class_types.class_abstract.AbstractAnimal;
import org.example.part1_class_types.class_abstract.Bird;
import org.example.part1_class_types.class_abstract.Dog;
import org.example.part1_class_types.class_interface.InterfaceAnimal;
import org.example.part1_class_types.class_object_concrete.ConcreteAnimal;

public class Main {
    public static void main(String[] args) {
        /* Clasa de obiect / Clasa concreta */
        ConcreteAnimal concreteAnimalObject1 = new ConcreteAnimal();
        concreteAnimalObject1.setVarsta(3);
        concreteAnimalObject1.setRasa("Pisica");
        ConcreteAnimal concreteAnimalObject2 = new ConcreteAnimal("caine",2);
        System.out.println(concreteAnimalObject1);
        System.out.println(concreteAnimalObject2 + "\n");

        /* Clase Anonime */

        //Putem instantia obiecte de tipul clasi abstracte?
                //varianta 1. NU, este nevoie de o clasa copil care sa mosteneasca/extinde clasa abstracta
                 // care se va comporta ca o clasa parinte
        //Varianta a 2-a de raspuns: Da, putem prin definirea si instantierea unui obiect folosind clsasele anonime,
        // astfel incat sa oferim un corp de implementare in interiorul unei clase de apel.

             /* Clasa abstracta */
       // AbstractAnimal abstractAnimalObject = new AbstractAnimal();//Obtin o eroare -> AbstractAnimal este abstracta, nu poate fi instantiata,
        // remedierea problemei este mai jos, corp de implementare anonima a clasei abstracte
        AbstractAnimal abstractAnimalObject = new AbstractAnimal() {
            @Override
            public void makeSound() {

            }
        };

        System.out.println("Afisari ale unei clase abstracte (parent class) si a claselor mostenite (sub-classes):");
        Dog dogObject = new Dog();
        dogObject.eat();
        dogObject.makeSound();
        Bird birdObject = new Bird();
        birdObject.eat();
        birdObject.makeSound();
        System.out.println();


        /* Interfata */
        InterfaceAnimal interfaceAnimalObject = new InterfaceAnimal() {
            @Override
            public void doSound() {

            }
        };

    }
}
