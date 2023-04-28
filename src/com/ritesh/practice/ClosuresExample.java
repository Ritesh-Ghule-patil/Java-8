package com.ritesh.practice;
import java.util.function.Consumer;

public class ClosuresExample {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int key = 10;

        process(arr,v-> {
            //key = 5  it will not allow us to change its effectively final
            //we are calling this method from process method and there we didnt declared key varibale
            //string method accepting it because of closures
            System.out.println(v*key);
        });
    }

    private static void process(int[] arr,  Consumer<Integer> consumer) {
        for (int i:arr ) {
            consumer.accept(i);
        }
    }
}
