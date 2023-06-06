package com.ritesh.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate customDate = LocalDate.of(1998,9,20);
        System.out.println(customDate);

        int dayOfMonth = today.getDayOfMonth();
        Month month = today.getMonth();
        int year = today.getYear();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Day of month : "+dayOfMonth);
        System.out.println("Day of week : "+dayOfWeek);
        System.out.println("month : "+month);
        System.out.println("year : "+year);

        LocalDate yesterday = today.minusDays(1);
        System.out.println("yesterday : "+yesterday);
        System.out.println( today.minusMonths(10));
        System.out.println(today.minusYears(2));

        if(today.isAfter(yesterday)){
            System.out.println("ha bhai today yesturday ke bad ata hai");
        }






    }


}
