package com.ritesh.practice;

import com.ritesh.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PersonExerciseWithLambda {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(new Person("Ritesh", "Ghule", 24), new Person("Rutuja", "Patil", 24), new Person("Snehal", "Patil", 24), new Person("Prajakta", "Naphade", 24));

        //problem 1: create method that print all element
        System.out.println("Printing All Person");
        printAll(persons);

        //problem 2: sort list by last name
        Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println("printing person sorting by their last name");
        printAll(persons);

        //problem 3: print Frist Name that beginning with Some Letter
        System.out.println("Print names that begging with R");
        printConditionally(persons,p->p.getFirstName().startsWith("R") );

        System.out.println("Print names whose lastname start with P");
        printConditionally(persons, p->p.getLastName().startsWith("P"));


    }

    //we modified this function with more functional in lambda as below printConditionally
//    private static void printNamesBeginningWith(List<Person> persons, String str) {
//
//        for (Person p : persons) {
//            if (p.getFirstName().startsWith(str)) {
//                System.out.println(p.getFirstName());
//            }
//        }
//        System.out.println();
//    }

    private static void printConditionally(List<Person> persons, Predicate<Person> predicate) {
        for (Person p:persons){
            if(predicate.test(p)){
                System.out.println(p.getFirstName());
            }
        }
        System.out.println();
    }

    private static void printAll(List<Person> persons) {
        persons.forEach(System.out::println);
        System.out.println();
    }
}

//interface Condition {
//    boolean check(Person p);
//}
