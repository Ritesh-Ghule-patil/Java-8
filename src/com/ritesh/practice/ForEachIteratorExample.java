package com.ritesh.practice;

import com.ritesh.model.Person;

import java.util.Arrays;
import java.util.List;

public class ForEachIteratorExample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Rutuja","Patil",23),
                new Person("Ritesh","Ghule",24),
                new Person("Prajakta","Naphade",22),
                new Person("Snehal","Patil",23)
        );

        //old java 7 ways here we mannually telling to iterate it sequentially so that's why it
        //can not use the multiple thread to execute it.
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        System.out.println("---------------------------------------------------");

        for (Person p :persons) {
            System.out.println(p);
        }

        System.out.println("---------------------------------------------------");
        persons.forEach(System.out::println);
    }
}
