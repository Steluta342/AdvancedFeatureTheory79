package org.example.part4_generic.generic_interface;

/*
    - Nu putem folosi instructiuni LAMBDA ptc avem mai mult de o metoda abstracta
    - ofera suport f bun pt abstractii mult mai complexe
    - putem sa avem mai multe metode abstracte


 */

public interface DataProcessor<T> {

    void process(T item);
    boolean validate(T item);
    String serialize(T item);



}
