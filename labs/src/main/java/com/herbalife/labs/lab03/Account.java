package com.herbalife.labs.lab03;

import java.util.Random;

public class Account {
    private int accountNumber;
    private double balance;
    private int withdrawMovements;

    public Account(double balance) {
        this.accountNumber = new Random().nextInt()%10000;

        if(balance < 10000)
            this.balance = 10000;
        else
            this.balance = balance;
        withdrawMovements = 0;
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
                withdrawMovements++;
                return true;
            }
        }
    }

    public boolean deposit(double quantity){
        if(quantity > 0) {
            this.balance += quantity;
            return true;
        }
        else{
            System.out.println("The Quantity value should be positive.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}
