package com.ritesh.practice;

import com.ritesh.model.Student;

import java.util.Arrays;
import java.util.List;

public class ConstuctorReferencing {

    public static void main(String[] args) {

        List<String> employees = Arrays.asList("Ritesh","prajakta","Ruruja","Snehal","Shubham");

        List<Student> list = employees.stream().map(x -> new Student(x)).toList();
        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------------");

        List<Student> list1 = employees.stream().map(Student::new).toList();
        System.out.println(list1);

    }
}
