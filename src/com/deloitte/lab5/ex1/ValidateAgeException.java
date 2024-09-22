

package com.deloitte.lab5.ex1;

import java.util.Scanner;

public class ValidateAgeException {
    
    // Define UnderAgeException as a static inner class
    static class UnderAgeException extends Exception {
        public UnderAgeException() {
            super("You are Underage"); // Pass message to superclass
        }
    }

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = scan1.nextInt();
        
        try {
            if (age <= 15) {
                throw new UnderAgeException(); 
            } else {
                System.out.println("You are Eligible");
            }
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage()); // Print the exception message
        } finally {
            scan1.close(); // Close the scanner to avoid resource leaks
        }
    }
}

