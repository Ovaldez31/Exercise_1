package com.ps;
public class FullNameApplication {
    public static void main(String[]args){


        String fullName = "Orchid|Leonid|Valdez";
        String[] names = fullName.split("\\|");

        System.out.println ("Please enter your name: " + fullName);
        if (names.length > 0) {
            System.out.println("First Name:" + names[0]);
        }

        if (names.length > 1) {
            System.out.println("Middle Name:" + names[1]);
        }

        if(names.length > 2) {
        System.out.println("Last Name:" + names[names.length -1]);
        }




    }
}
