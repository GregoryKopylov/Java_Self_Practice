package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));

        ArrayList<Integer> list2 = new ArrayList<>();   // for storing elements without duplicates

        for (Integer element : list1) {          // to get each element from the list1
            if (!list2.contains(element)) {
                list2.add(element);
            }
        }
        System.out.println(list2);
    }
}

/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */