package day16_practice_task;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
                            // [0, 5, 8, 10, 11, 20]
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
                            // TreeSet will put elements in natural order [0, 10, 20, 30, 40, 50, 60]
        Set<Integer> set3 = new TreeSet<>(set1); //setting set 3 to organized set1 [0, 5, 8, 10, 11, 20]

        set3.retainAll(set2); //Retains only the elements in this set that are contained in the specified collection
        // (optional operation). In other words, removes from this set all of its elements that are not contained
        // in the specified collection. If the specified collection is also a set, this operation effectively modifies
        // this set so that its value is the intersection of the two sets.

        System.out.println(set3);

    }
}

/*
3. Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}

 */