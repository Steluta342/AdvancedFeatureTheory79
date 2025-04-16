package org.example.part2_oop_principles.composition;
/*
Definitie: Compozitia presupune ca o clasa sa detina instante ale altor clase pt
a-si defini comportamentul.

        Prin urmare, e o consecinta a incapsularii, si functioneaza dpdv structural invers
fata de mostenire.

Mostenirea porneste de la o clasa de baza si defineste mai multe sub clase.
Compozitia porneste de la mai multe sub clase si defineste o clasa de baza.

O aplicatie directa a compozitiei sunt clasele finale.
Clasele finale marcheaza o clasa ca fiind nemostenibila.
        */
public final class Car {

    private Engine engine;
    private String brand;
    private String seria;
    private String nrInmatriculare;

    public Car(Engine engine, String brand, String seria, String nrInmatriculare) {
        this.engine = engine;
        this.brand = brand;
        this.seria = seria;
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", brand='" + brand + '\'' +
                ", seria='" + seria + '\'' +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                '}';
    }
}
