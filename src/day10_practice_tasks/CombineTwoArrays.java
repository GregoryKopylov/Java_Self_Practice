package day10_practice_tasks;

import java.util.ArrayList;

public class CombineTwoArrays {

    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();   //creating list

        for (String each : arr1) {   // getting each element of arr1
            list.add(each);          // adding these elements to the list
        }
        for (String each : arr2) {   // getting each element from arr2
            list.add(each);          // adding these element to the same list
        }
        System.out.println(list);    // printin list [A, B, C, D, E, F, G]
    }
}


/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */