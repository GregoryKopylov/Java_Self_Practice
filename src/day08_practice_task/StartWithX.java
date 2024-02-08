package day08_practice_task;

import java.util.Scanner;

public class StartWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.next();

        String newStr1 = word.replaceFirst("x", "a");

        System.out.println(newStr1);

    }

}


/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */