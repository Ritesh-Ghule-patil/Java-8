package com.ritesh.practice;

import com.ritesh.interfaces.Greeting;

public interface BasicLambda {
    public static void main(String[] args) {

        String name = "Ritesh";

        Greeting birthday = (String str)-> {
            return "Happy Birthday Dear " + str;
        };
        System.out.println(birthday.greet(name));

        Greeting anniversary = (String str)->{
            return "Happy Anniversary Dear "+name;
        };
        System.out.println(anniversary.greet(name));
    }
}
