package com.ritesh.DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myFormat = now.format(formatter);
        System.out.println(myFormat);

        String date = "20/09/1998";
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(date, format1);
        System.out.println(parsedDate);


    }
}
