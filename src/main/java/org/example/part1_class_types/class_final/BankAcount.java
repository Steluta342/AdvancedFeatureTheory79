package org.example.part1_class_types.class_final;

public final class BankAcount {
    private String accountNumber;

    public BankAcount(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void display() {
        System.out.println("Account Number: " + accountNumber);
    }

}
