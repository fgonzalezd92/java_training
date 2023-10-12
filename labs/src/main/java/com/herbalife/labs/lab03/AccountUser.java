package com.herbalife.labs.lab03;

public class AccountUser {
    public static void main(String[] args) {
        Account account = new Account(20000);

        account.deposit(10000);
        account.deposit(10000);

        account.withdraw(5000);
        account.withdraw(5000);
        account.withdraw(5000);
        account.withdraw(5000);
        account.withdraw(5000);
        account.withdraw(5000);


        System.out.println("Final balance is: %s".formatted(account.getBalance()));
    }
}
