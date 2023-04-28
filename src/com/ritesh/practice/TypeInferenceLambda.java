package com.ritesh.practice;

import com.ritesh.interfaces.Greeting;

public class TypeInferenceLambda {
    public static void main(String[] args) {

        String name = "Ritesh";

        Greeting birthday = str -> "Happy Birthday Dear " + str;
        System.out.println(birthday.greet(name));

        Greeting anniversary = str-> "Happy Anniversary Dear "+name;

        System.out.println(anniversary.greet(name));

    }

}
