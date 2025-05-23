package org.example.part2_oop_principles;

import org.example.part2_oop_principles.composition.Car;
import org.example.part2_oop_principles.composition.Engine;
import org.example.part2_oop_principles.encapsulation.UserAccount;
import org.example.part2_oop_principles.inheritance.Chef;
import org.example.part2_oop_principles.inheritance.Employee;
import org.example.part2_oop_principles.inheritance.Waiter;
import org.example.part2_oop_principles.polymorphism.Developer;
import org.example.part2_oop_principles.polymorphism.FrontEndDev;

public class Main {
    public static void main(String[] args) {
        /* Encapsulation */

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("jianu14");
        userAccount.setPassword("CatelusCuParulCret14");

        System.out.println(userAccount.getUsername() + "\n");

        /* Inheritance */
        Employee employee = new Employee("1234", "Dragu", "Steluta", 34);
        Chef chef = new Chef("6549", "Ion", "Ionel", 23,"Ajutor de bucatar");
        Waiter waiter = new Waiter("659", "Casota", "Maria", 29,56.2);

        System.out.println("Input din parent class Employee: " + employee.generateText());
        employee.sayHi();

        System.out.println("Input din parent class Chef: " + chef.generateText());
        chef.sayHi();

        System.out.println("Input din parent class Waiter: " + waiter.generateText());
        waiter.sayHi();

        /*Polimorphism */
        Developer developer = new Developer();
        FrontEndDev frontEndDev = new FrontEndDev();

        developer.work();
        frontEndDev.work();

        System.out.println(developer.add(4, 4));
        System.out.println(developer.add(4.2, 4));
        System.out.println(developer.add(16546L, 5845344787654L));
        System.out.println();

        /*Composition */
        Engine engine = new Engine(34,"mare rau");
        Car car = new Car(engine, "WW", "Golf", "B830DST");

        System.out.println(engine);
        System.out.println(car);

    }


}
