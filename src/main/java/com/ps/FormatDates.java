package com.ps;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {
        // Create a LocalDateTime object that holds the current date and time in UTC
        LocalDateTime nowUTC = LocalDateTime.now(ZoneId.of("UTC"));

        // Define different formats to display the date and time
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("HH:mm 'on' MMM-d-yyyy");

        // Adjust the LocalDateTime object to New York timezone
        LocalDateTime nowNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));

        // Display the current date and time in UTC in various formats
        System.out.println("Current time in UTC:");
        System.out.println(nowUTC.format(format1));
        System.out.println(nowUTC.format(format2));
        System.out.println(nowUTC.format(format3));
        System.out.println(nowUTC.format(format4));

        // Display the current date and time in New York timezone in the local time format
        System.out.println("\nCurrent time in New York timezone:");
        System.out.println(nowNewYork.format(format5));
    }
}
