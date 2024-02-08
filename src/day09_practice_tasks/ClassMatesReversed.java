package day09_practice_tasks;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classmates = {"James Bond", "Jack Sparrow", "Marry Poppins", "Vitali Klitchko", "Andrey Shevchenko", "Mila Coonis",
                "Elena Bluzhina", "Duncan McCloud", "Alex Kvadrat", "Panya Neryanov"};


        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);


        }
    }

}





/*
6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */