package com.ritesh.practice;

import com.ritesh.model.Person;

import java.util.Arrays;
import java.util.List;

public class StramExample {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Rutuja","Patil",23),
                new Person("Rj","Patil",23),
                new Person("Rc","Patil",23),
                new Person("Rd","Patil",23),
                new Person("Ritesh","Ghule",24),
                new Person("Prajakta","Naphade",22),
                new Person("Snehal","Patil",23)
        );
        //it is like assembly line in car manufacture company where one by part is assembled
        //this will only use single core (tread) and gives sequensial and same result each time
        persons.stream()
        .filter(p->p.getFirstName()
        .startsWith("R"))
        .forEach(System.out::println);

        System.out.println("------------------------------------");

        //this will only use multiple core (tread) and gives non-sequensial and can give different result each time
        persons.parallelStream()
        .filter(p->p.getFirstName()
        .startsWith("R"))
        .forEach(System.out::println);


    }
}
