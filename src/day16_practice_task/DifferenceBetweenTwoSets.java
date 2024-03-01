package day16_practice_task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,5));
        
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4));
        
        Set<Integer> set3= new HashSet<>(set1);
        
        set3.removeAll(set2);
        /*
        Removes from this set all of its elements that are contained in the specified collection
        (optional operation). If the specified collection is also a set, this
        operation effectively modifies this set so that its value is the asymmetric set difference
        of the two sets.
         */

        System.out.println("set3 = " + set3);

        //another way to resolve this task


        Set<Integer> set4 = new TreeSet<>(Arrays.asList(1,2,3,5));
        Set<Integer> set5 = new TreeSet<>(Arrays.asList(2,3,4));
        Set<Integer> set6 = new TreeSet<>(set4);
        set6.removeAll(set5);

        System.out.println("set6 = " + set6);


    }
}

/*
  4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

        Example:
        Set1 = {1, 2, 3, 5}
        Set2 = {2, 3, 4}

        Output:
        {1, 5}

        Removes from this set all of its elements that are contained in the specified collection
        (optional operation). If the specified collection is also a set, this
        operation effectively modifies this set so that its value is the asymmetric set difference
        of the two sets.
 */