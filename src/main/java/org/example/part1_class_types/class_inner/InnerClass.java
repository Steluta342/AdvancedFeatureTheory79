package org.example.part1_class_types.class_inner;

import org.example.part1_class_types.class_abstract.AbstractAnimal;
import org.example.part1_class_types.class_abstract.Dog;
import org.example.part1_class_types.class_interface.InterfaceAnimal;

public class InnerClass {

    /* Static Nested Class */
    static class StaticNestedClassExample {
        //putem avea atribute, constructori, alte metode, getters/setters, orice metoda de suprascriere

        void display() {
            System.out.println("Salutare din interiorul unei clase statice interna!");
        }

    }

    /* Non-static Nested Class */
    class NonStaticNestedClassExample {
        //putem avea atribute, constructori, alte metode, getters/setters, orice metoda de suprascriere

        void display() {
            System.out.println("Salutare din interiorul unei clase non-statice interna!");
        }

    }
    /*beneficii si scenarii comune:
    * imbunatatirea modularizarii si a struct
    * scopul este de  a izola o logica interna utilizata excluziv in clasa de definitie
    *
    * diferenta principala intre ce el 2 clase se va apela la nivel de clasa  -> InnerCalas*/

    public static void main(String[] args) {
        /*Clasa statica interna*/
        InnerClass.StaticNestedClassExample staticNestedClassObject = new StaticNestedClassExample();
        staticNestedClassObject.display();

        /*Clasa non-statica interna*/
        InnerClass innerClassObject = new InnerClass();
        NonStaticNestedClassExample nonStaticNestedClassObject = innerClassObject.new NonStaticNestedClassExample();
        nonStaticNestedClassObject.display();

        /* Clase Anonime */

        /*Clasa abstracta */
        AbstractAnimal abstractAnimalObject = new AbstractAnimal() {
            @Override
            public void makeSound() {
                System.out.println("Sunet din interiorul unei clase anonime!");

            }
        };
        abstractAnimalObject.eat();
        abstractAnimalObject.makeSound();

        /* Interfata */
        InterfaceAnimal interfaceAnimalObject = new InterfaceAnimal() {
            @Override
            public void doSound() {

            }

            @Override
            public void doSmething() {

            }

            @Override
            public int claculateNumber() {
                return 0;
            }

            @Override
            public String generateText() {
                return "";
            }

            @Override
            public Dog getDog() {
                return null;
            }
        };
        interfaceAnimalObject.doSmething();
    }
}
