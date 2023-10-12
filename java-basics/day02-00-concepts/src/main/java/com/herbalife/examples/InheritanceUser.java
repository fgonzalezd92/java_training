package com.herbalife.examples;

public class InheritanceUser {
    public static void main(String[] args){
        Manager manager = new Manager("Sam",5);
        manager.work(12);

        Employee e1 = new Manager("Frank", 2);
        e1.work(12);
    }
}
