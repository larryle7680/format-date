package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FormatDateApp {
static Scanner theScanner = new Scanner(System.in);

    static LocalDateTime dateTime = LocalDateTime.now();


    static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
    static DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    static DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy");
    static DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy HH:mm");
    static ZonedDateTime gMT = ZonedDateTime.now(ZoneId.of("GMT"));

    public static void main(String[] args) {
        String newDateTime = dateTime.format(dateFormatter);
        String newDateTime1 = dateTime.format(dateFormatter2);
        String newDateTime2 = dateTime.format(dateFormatter3);
        String newDateTime3 = dateTime.format(dateFormatter4);

        System.out.println(newDateTime);
        System.out.println(newDateTime1);
        System.out.println(newDateTime2);
        System.out.println(gMT.format(dateFormatter4));









    }
}
