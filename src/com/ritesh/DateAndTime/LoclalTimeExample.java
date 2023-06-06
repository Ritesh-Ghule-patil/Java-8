package com.ritesh.DateAndTime;

import java.time.LocalTime;

public class LoclalTimeExample {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("Current time : "+ time);

        LocalTime customeTime = LocalTime.of(14,30,30);
        System.out.println("customeTime : "+customeTime);

        String timeInString = "14:38:25";
        LocalTime parseTime = LocalTime.parse(timeInString);
        System.out.println("String to Time : "+ parseTime);

        System.out.println("Hour : "+time.getHour());

        LocalTime beforeHour = time.minusHours(1);
        System.out.println("Befor Hour : "+beforeHour);

        if(beforeHour.isBefore(time)){
            System.out.println("ha bhai....!");
        }
    }
}
