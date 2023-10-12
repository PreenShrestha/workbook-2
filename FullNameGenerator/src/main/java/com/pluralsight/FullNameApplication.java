package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = getUserInput(scanner,"Enter your first name: ");
        String MiddleName = getUserInput(scanner, "Enter Middle Name: ");
        String LastName = getUserInput(scanner, "Enter last name: ");
        String title = getUserInput(scanner, "Enter your title: ");

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        if (MiddleName.length() == 1)
        {
            MiddleName = MiddleName + ".";
        }

        if (!title.isBlank())
        {
            title = ", " + title;
            title = title.toUpperCase();
        }

        System.out.println(firstName + " "+ MiddleName + " " + LastName + title);




    }

    public static  String getUserInput(Scanner scanner, String prompt)
    {
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
}