package com.ritesh.practice;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionBiCosumerExample {
    public static void main(String[] args) {

        BiPredicate<String,String> isEquals = String::equalsIgnoreCase;
        System.out.println(isEquals.test("RItesh","ritesh"));

        BiFunction<String,String,Integer> biFunction = (x,y)-> (x+y).length();
        System.out.println(biFunction.apply("Ritesh","Ghule"));

        BiConsumer<Integer,Integer> biConsumer = (x,y)-> System.out.println("Multiplication ->"+ x +" * "+y +" = "+ x * y);
        biConsumer.accept(10,10);

         /*
          and there is no biSupplier because supplier used to supply result
          and we can not give the two return type for any function
         */

    }
}
