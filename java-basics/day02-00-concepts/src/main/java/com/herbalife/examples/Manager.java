package com.herbalife.examples;

public class Manager extends Employee{
    private int level;
    public Manager(String name, int level) {
        super(name);
        this.level = level;
    }

    public void work(int hours) {
        super.work(hours);
        System.out.println("Manager %s works %s hours".formatted(getName(), hours));
    }

    public void fileTax(){

    }
}
