package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FormatDateApp {
static Scanner theScanner = new Scanner(System.in);
    static LocalTime dateTime = LocalTime.now();
    static LocalDate date = LocalDate.now();
    static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
    static DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    static DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    static DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

    public static void main(String[] args) {
        LocalTime dateTime = LocalTime.now();
        LocalDate date = LocalDate.now();







    }
}
