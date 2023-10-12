package com.herbalife.labs.lab03;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private long accountNumber;
    private double balance;
    private int withdrawMovements;
    private List<Transaction> transactions;

    public Account(int accountNumber, double balance){
        if(balance < 10000){
            throw new RuntimeException("The balance should be greater than 10000.");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        withdrawMovements = 0;
        this.transactions =  new ArrayList<>();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double quantity){
        if(withdrawMovements > 3){ // Fee
            double quantityWithFee = Math.round(quantity * (100.5f/100.00f));
            if(quantityWithFee> balance){
                System.out.println("Not enough balance.");
                return false;
            }
            else{
                balance -= quantityWithFee;
                this.transactions.add(new Transaction(accountNumber, quantity, "DEBIT", Instant.now().toString()));
                withdrawMovements++;
                return true;
            }
        }
        else{
            if(quantity> balance){
                System.out.println("Not enough balance.");
                return false;
            }
            else{
                balance -= quantity;
                this.transactions.add(new Transaction(accountNumber, quantity, "DEBIT", Instant.now().toString()));
                withdrawMovements++;
                return true;
            }
        }
    }

    public boolean deposit(double quantity){
        if(quantity > 0) {
            this.balance += quantity;
            this.transactions.add(new Transaction(accountNumber, quantity, "CREDIT", Instant.now().toString()));
            return true;
        }
        else{
            System.out.println("The Quantity value should be positive.");
            return false;
        }
    }



}
