package com.ritesh.practice;

import com.ritesh.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Rutuja","Patil",23),
                new Person("Ritesh","Ghule",24),
                new Person("Prajakta","Naphade",22),
                new Person("Snehal","Patil",23)
        );

        Function<String, String> stringInUpperCase = String::toUpperCase;
        System.out.println(stringInUpperCase.apply(persons.get(0).getFirstName()));

        Function<String , String > subStringWithFirstThreeLetter = x->x.substring(0,3);
        System.out.println(subStringWithFirstThreeLetter.apply("Prajakta"));

        //andThen method
        System.out.println(stringInUpperCase.andThen(subStringWithFirstThreeLetter).apply("Ritesh"));



        Function<List<Person>, List<Person>> studentWithNameR = stu-> stu.stream().filter(s->s.getFirstName().startsWith("R")).toList();

        System.out.println(studentWithNameR.apply(persons));
    }
}
