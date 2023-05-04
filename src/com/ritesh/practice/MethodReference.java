package com.ritesh.practice;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public  void print(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Ritesh","prajakta","Ruruja","Snehal","Shubham");
        MethodReference printer = new MethodReference();

        employees.forEach(x->printer.print(x));
        System.out.println("----------------------------------------");
        employees.forEach(System.out::println);
        System.out.println("----------------------------------------");
        employees.forEach(printer::print);




    }
}
