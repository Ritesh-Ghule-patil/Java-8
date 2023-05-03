package com.ritesh.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> newList = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("List of even numbers -> "+newList);

        int sum = newList.stream().mapToInt(n-> n).sum();
        System.out.println("Sum -> "+sum);

        //--------------------------------------------------------------------

        Predicate<String> startWithR = str->str.toLowerCase().charAt(0)=='r';
        Predicate<String> endWithH = str -> str.toLowerCase().charAt(str.length()-1)=='h';

        System.out.println(endWithH.test("Ritesh"));

        Predicate<String> and = startWithR.and(endWithH);

        Predicate<String> or = startWithR.or(endWithH);

        System.out.println(and.test("Rahul")); //will return true if and only is both condn satisfied

        System.out.println(or.test("Rahul")); // will return true if any one condn satisfied

        System.out.println(or.negate().test("Rahul")); //will to opposite of prior return result

        Predicate<Object> isequal = Predicate.isEqual("Ritesh");

        System.out.println("is Both Strings equals -> "+ isequal.test("Ritesh"));
    }
}
