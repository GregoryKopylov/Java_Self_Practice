package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"James Bond", "Jack Sparrow", "Marry Poppins", "Vitali Klitchko", "Andrey Shevchenko", "Mila Coonis",
                "Elena Bluzhina", "Duncan McCloud", "Alex Kvadrat", "Panya Neryanov"};

        String[] initials = new String[classmates.length];

        for (int i = 0; i < classmates.length; i++) {
            String eachName = classmates[i];
            initials[i] = eachName.charAt(0) + "." + eachName.charAt(eachName.lastIndexOf(" ") + 1) + ".";
        }

        for (String initial : initials) {
            System.out.println(initial);
        }


    }
}


/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */