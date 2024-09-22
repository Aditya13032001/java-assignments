package com.deloitte.lab5.ex2;

import java.util.*;

public class EmpNameValid {

    static class NameValidateException extends Exception {
        public NameValidateException(String typeOfValidation) {
            super("Please Enter " + typeOfValidation);
        }
    }

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("-------Employee Details-------");
        System.out.print("Enter First Name:");
        String firstName = scan1.nextLine();
        System.out.print("Enter Last Name:");
        String lastName = scan1.nextLine();

        try {
            if (firstName.isBlank() && !lastName.isBlank()) {
                throw new NameValidateException("First Name");
            } else if (lastName.isBlank() && !firstName.isBlank()) {
                throw new NameValidateException("Last Name");
            } else if (firstName.isBlank() && lastName.isBlank()) {
                throw new NameValidateException("Both First Name and Last Name");
            } else {
                System.out.println("-------Entered Details-------");
                System.out.println(firstName + " " + lastName);
            }
        } catch (NameValidateException e) {
            System.out.println(e.getMessage());
        }
    }
}