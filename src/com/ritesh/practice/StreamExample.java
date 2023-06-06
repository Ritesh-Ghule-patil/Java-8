package com.ritesh.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        int sum =0;
//        for (int i:nums) {
//            if(i % 2 == 0)
//                sum += i;
//        }
//        System.out.println(sum);
//
//        int sum1 = Arrays.stream(nums).filter(n -> n % 2 == 0).sum();
//        System.out.println(sum1);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 3, 4, 53, 2, 4, 8, 9, 11, 22, 33, 44, 55, 66);
        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Even List ->    " + evenList);

        List<Integer> dividedList = evenList.stream().map(n -> n / 2).sorted().collect(Collectors.toList());
        System.out.println("Divided by 2 -> " + dividedList);

        List<Integer> distinctList = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).sorted((x, y) -> y - x).distinct().limit(5).collect(Collectors.toList());
        System.out.println("Distinct List-> " + distinctList);

        List<Integer> iterator = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted((x, y) -> y - x)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(iterator);

        long count = iterator.stream().distinct().count();
        System.out.println("Count -> "+count);
    }
}
