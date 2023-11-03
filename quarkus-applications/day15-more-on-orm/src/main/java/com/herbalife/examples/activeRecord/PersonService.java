package com.herbalife.examples.activeRecord;

import jakarta.transaction.Transactional;

import java.util.List;

public class PersonService {
    @Transactional
    public void createPerson(String firstName, String lastName, int age){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.persist();
    }

    @Transactional
    public void removePerson(int id){
        Person person =  Person.findById(id);
        person.delete();
    }

    public List<Person> getAllPersons(){
        return Person.listAll();
    }

    public List<String> getAllFirstNames(){
        return Person
                .find("select firstName from Person")
                .project(String.class)
                .list();
    }
}
