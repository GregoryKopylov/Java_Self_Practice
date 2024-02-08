package day08_practice_task;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = input.next();

        input.close();

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        String domain = email.substring(email.indexOf("@"));
        domain = domain.substring(domain.indexOf("@")+1, domain.indexOf("."));

        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);


    }

}


/*
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */