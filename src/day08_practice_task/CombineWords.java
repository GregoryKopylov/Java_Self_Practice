package day08_practice_task;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = input.next();
        String word2 = input.next();

        input.close();

        if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
            word1 = word1 + word2.substring(1);
            System.out.println(word1);
        }else{
            word1 = word1.concat(word2);
            System.out.println(word1);
        }
    }
}


/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */