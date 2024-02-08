package day09_practice_tasks;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[100];

        int lengthOfArray = numbers.length;
        System.out.println("Length of Array = " + lengthOfArray);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (int j = numbers.length - 1; j >= 0; j--) {
            numbers[j] = j + 1;
            System.out.print(numbers[j] + " ");
        }

        System.out.println();


        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }


        }
    }
}


/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.


 */