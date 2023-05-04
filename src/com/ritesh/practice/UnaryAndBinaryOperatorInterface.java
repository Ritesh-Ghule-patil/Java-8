package com.ritesh.practice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorInterface {
    public static void main(String[] args) {
        //if our argument type and return type are same then we can use the unary and BinaryOperator interface

        Function<Integer,Integer> function = x -> x * x;
        System.out.println(function.apply(10));

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(10));

        BiFunction<String,String,String> biFunction = (x,y) -> x + y;
        System.out.println(biFunction.apply("Ritesh"," Ghule"));

        BinaryOperator<String> binaryOperator = (x , y ) -> x + y;
        System.out.println(binaryOperator.apply("Ritesh", " Ghule"));
    }
}
