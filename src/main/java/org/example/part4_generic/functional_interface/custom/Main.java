package org.example.part4_generic.functional_interface.custom;

public class Main {
    public static void main(String[] args) {

        /* Exemplu 1: Interfete functionale neparametrizate */
        System.out.println("Exemplu 1: Interfete functionale neparametrizate");
        Message displayHello = () -> "Hello!";
        System.out.println(displayHello.display());

        Message sayBanana = () -> "Bananasss!!!";
        System.out.println(sayBanana.display());

        Message text = () -> {

            return "Very important text!";
        };
        System.out.println(text.display() + "\n--------------------------------");

        /* Exemplu 2: Interfete functionale parametrizate cu un argument */
        System.out.println("Exemplu 2: Interfete functionale parametrizate cu un argument");
        StringTransformer reverseString = s -> new StringBuilder(s).reverse().toString();

        System.out.println(reverseString.transform("mere") + "\n--------------------------------");
        System.out.println(reverseString.transform("ana") + "\n--------------------------------");

        StringTransformer toUpper = String::toUpperCase;
        StringTransformer toLower = String::toLowerCase;
        System.out.println("\n--------------------------------");


        /* Exemplu 3: Interfete functionale parametrizate cu doua argumente */
        System.out.println("Exemplu 3: Interfete functionale parametrizate cu doua argumente");
        Power numberExp1 = (nr, exp) -> {
            int result = 1;
            for (int i = 0; i < exp; i++) {
                result *= nr;

            }
            return result;
        };
        System.out.println("5^2 = " + numberExp1.apply(5, 2));
        System.out.println("7^2 = " + numberExp1.apply(7, 2));
        System.out.println("5^3 = " + numberExp1.apply(5, 3));

        Power numberExp2 = (int a, int b) -> (int) Math.pow(a,b);
        System.out.println("10^3 = " + numberExp2.apply(10, 3));

    }
}
