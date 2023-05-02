package com.ritesh.interfaces;
@FunctionalInterface
public interface Greeting {
     String greet(String name);

     default void greetHello(){
        System.out.println("Hello, How Are You..!");
    }

     static void geetBye(){
        System.out.println("Nice To Interact With You, Bye Bye Will Meet Soon...!");
    }
}
