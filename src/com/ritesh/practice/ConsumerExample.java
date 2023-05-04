package com.ritesh.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> persons = Arrays.asList(10,20,30,40,50,60,70,80);

        Consumer<String> consumer = System.out::println;
        consumer.accept("Ritesh");

        Consumer<List<Integer>> listConsumer = list->list.forEach(System.out::println);
//        listConsumer.accept(persons);

        Consumer<List<Integer>> listConsumer2 = list->list.stream().map(l->l*l).forEach(System.out::println);
//        listConsumer2.accept(persons);

        listConsumer.andThen(listConsumer2).accept(persons);

        Consumer<Integer> display = System.out::println;
        Consumer<Integer> square = x-> System.out.println(x*x);

        System.out.println("---------------------------------------------------------");

        display.andThen(square).accept(10);
        square.andThen(display).accept(20);






    }
}
