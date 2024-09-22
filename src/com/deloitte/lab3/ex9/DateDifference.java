package com.deloitte.lab3.ex9;

import java.util.*;
import java.time.*;

public class DateDifference {

    public static void printDuration(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(inputDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Duration: " + years + " years, " + months + " months, " + days + " days");
    }

    public static void main(String[] args) {
    	Scanner scan1=new Scanner(System.in);
        LocalDate inputDate = LocalDate.of(2027, 1, 1); // Replace with your desired input date
        printDuration(inputDate);
    }
}

