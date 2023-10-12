package com.herbalife.examples;

public class RecordExample {
    public static void main(String[] args) {
        PersonInput personInput = new PersonInput(101, "Sam");
    }
}

record PersonInput(int id, String name){}
