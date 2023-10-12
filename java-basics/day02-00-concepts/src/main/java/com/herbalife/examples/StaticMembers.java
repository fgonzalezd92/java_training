package com.herbalife.examples;

public class StaticMembers {
    public static void main(String[] args) {
        Company hl =  new Company("Hl");
        Company ibm =  new Company("IBM");
        System.out.println(Company.getNumberOfCompanies());
        System.out.println(hl.getNumberOfCompanies());
        System.out.println(ibm.getNumberOfCompanies());
    }
}

class Company{
    private String name;
    private static  int numberOfCompanies;

    public Company(String name){
        this.name = name;
        numberOfCompanies++;
    }
    public static  int getNumberOfCompanies(){
        return numberOfCompanies;
    }
}