package org.example.part2_oop_principles.inheritance;

public class Chef extends Employee {

    private String seniority;

    public Chef(String id,
                String name,
                String surname,
                int age,
                String seniority
    ) {
        super(id, name, surname, age);
        this.seniority = seniority;
    }

    @Override
    public void sayHi() {
        super.sayHi();
        //daca metoda din classa parinte ar fi returnabila, atunci am stoca
        //rezultatul intr-o variabila pe care ati manipula-o in functie de context
        System.out.println(super.id);
    }
}
