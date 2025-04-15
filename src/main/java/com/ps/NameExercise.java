package com.ps;

import java.util.regex.Pattern;

public class NameExercise {
    public static void main(String[]args){


        String fullName = "Orchid|Leonid|Valdez";
        String[] names = fullName.split(" ");

        System.out.println ("Please enter your name: " + fullName);
        if (names.length > 0) {
            System.out.println("First Name:" + names[0]);
        }

        System.out.println("Middle Name:" );
        System.out.println("Last Name:" );




    }
}
