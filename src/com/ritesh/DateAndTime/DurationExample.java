package com.ritesh.DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class DurationExample {
    public static void main(String[] args) {

        Instant start = Instant.now();
        int sum=0;
        for (int i=0; i<10000;i++){
            for (int j = 0; j <i; j++) {
                sum+=1;
            }
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration);

        Duration subscription = Duration.ofDays(28);
        System.out.println(subscription.toDays());

        //------- Period for Long time -----------------------

        LocalDate now = LocalDate.now();
        LocalDate dob = LocalDate.of(1998, 9, 20);

        Period age = Period.between(dob, now);

        System.out.println("Your AAge : "+age);
    }
}
