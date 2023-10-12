package com.herbalife.labs.lab03;

public class AccountUser {
    public static void main(String[] args) {
        Account account = new Account(3246543, 100000);
        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        System.out.println("Balance %s".formatted(account.getBalance()));
        System.out.println("*******Statement*******");

    }
}
