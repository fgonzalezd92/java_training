package com.herbalife.examples;

public class LambdaBasics1 {
    public static void main(String[] args) {
        Printer oldStylePrinter =  new PrinterImpl();
        oldStylePrinter.print("hello");
        //Anonymous inner class; A class with no name
        Printer latestPrinter = new Printer() {
            public void print(String data) {
                System.out.println(data);
            }
        };
        latestPrinter.print("hi");

//        Lambda expression is an implementation of an interface
        Printer modernPrinter =  da -> System.out.println(da);
        modernPrinter.print("modern");
    }
}

// An interface with just ONE abstract method is called FunctionalInterface
interface Printer{
    void print(String data);
    default void doSomething() {}
    static void doSomethingElse() {}
}

class PrinterImpl implements Printer{
    public void print(String data) {
        System.out.println(data);
    }
}