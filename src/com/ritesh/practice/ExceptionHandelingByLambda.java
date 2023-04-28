package com.ritesh.practice;

import java.util.function.BiConsumer;

public class ExceptionHandelingByLambda {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int key = 0;

        process(arr,key,(k,v)-> {
            try {
                System.out.println(k / v);
            }
            catch (ArithmeticException e){
                System.out.println("You can't Divide a number by Zero");

            }
        });
    }

    private static void process(int[] arr, int key, BiConsumer<Integer,Integer> consumer) {
        for (int i:arr ) {
            consumer.accept(i,key);
        }
    }
}
