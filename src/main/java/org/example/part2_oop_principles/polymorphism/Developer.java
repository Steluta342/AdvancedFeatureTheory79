package org.example.part2_oop_principles.polymorphism;
/* Definitie: Polimorfismul permite apelarea aceleiasi metode pe
obiecte de tipuri de date diferite, comportamentul fiind
specific fiecarui obiect.

Se poate manifesta in 2 moduri:
        - polimorfism static - compile time - prin supraincarcarea unui set de metode
        -- se intampla DOAR la nivelul clasei in care exista un set de metode
        -- se pastreaza denumirea metodei, dar se poate schimba atat semnatura, cat si
implementarea
    - polimorfism dinamic - runtime - prin suprascrierea metodelor
        -- se intampla exclusiv in momentul unei relatii de mostenire intre clase,
astfel incat clasa copil poate suprascrie metodele din clasa parinte
        -- se pastreaza semnatura metodei, dar se schimba corpul de implementare (optional)
 */
public class Developer {

    //Poliformism dinamic - supracsriere in baza mostenirii

    public void work() {
        System.out.println("Developer works");
    }
    //Poliformism static - supraincarcare in baza redefinirii
    //metodelor in functie de inputul returnat/
    //merge si pe metode
    public int add(int a, int b) {
        return  a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }
}
