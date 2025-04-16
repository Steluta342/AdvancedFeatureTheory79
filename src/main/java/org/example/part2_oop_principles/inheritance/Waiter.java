package org.example.part2_oop_principles.inheritance;
/*
* Definitie: MOstenirea permite unei clase (clasa copil/sub-clasa)
* sa preia proprietati si metode dintr-o clasa existenta (clasa parinte/clasa de baza)
* */
public class Waiter extends Employee {

    private double tips;

    public Waiter(String id,
                  String name,
                  String surname,
                  int age,
                  double tips
    ) {
        super(id, name, surname, age);
        this.tips = tips;
    }

    @Override
    public void sayHi() {

        System.out.println("Hi! I am a waiter!");
    }
}
