package org.example.part2_oop_principles;

import org.example.part2_oop_principles.encapsulation.UserAccount;

public class Main {
    public static void main(String[] args) {
        /* Encapsulation */

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("jianu14");
        userAccount.setPassword("CatelusCuParulCret14");

        System.out.println(userAccount.getUsername());
    }
}
