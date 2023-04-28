package com.ritesh.practice;

import com.ritesh.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonExerciseWithJava7 {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Rutuja","Patil",23),
                new Person("Ritesh","Ghule",24),
                new Person("Prajakta","Naphade",22),
                new Person("Snehal","Patil",23)
        );

    //problem 1: create method that print all element
        System.out.println("Printing All Person");
        printAll(persons);

    //problem 2: sort list by last name
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.println("printing person sorting by their last name");
        printAll(persons);

    //problem 3: print Frist Name that beginning with Some Letter
        System.out.println("Print names that begging with R");
        printNamesBeginningWith(persons, "R");
        System.out.println("Print names that begging with P");
        printNamesBeginningWith(persons, "P");




    }

    private static void printNamesBeginningWith(List<Person> persons, String str) {

        for (Person p : persons){
            if(p.getFirstName().startsWith(str)) {
                System.out.println(p.getFirstName());
            }
        }
        System.out.println();
    }

    private static void printAll(List<Person> persons) {
        for (Person p :persons) {
            System.out.println(p);
        }
        System.out.println();
    }
}
