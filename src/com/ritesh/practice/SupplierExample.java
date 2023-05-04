package com.ritesh.practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Predicate<Integer> prediacte = x-> x % 2==0;
        Function<Integer,Integer> function = x->x * x;
        Consumer<Integer> display = x-> System.out.println(x);
        Supplier<Integer> supplier = ()->100;

        if(prediacte.test(supplier.get())){
            display.accept(function.apply(supplier.get()));
        }

    }
}
