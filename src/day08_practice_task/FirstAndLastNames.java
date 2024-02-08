package day08_practice_task;

import java.util.Scanner;

public class FirstAndLastNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.nextLine();
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Enter your last name:");
        String lastName = input.nextLine();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        input.close();

        System.out.println(firstName + " " + lastName);

    }
}

/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */