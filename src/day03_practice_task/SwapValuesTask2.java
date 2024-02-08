package day03_practice_task;

public class SwapValuesTask2 {

    public static void main(String[] args) {

        // Without using Temporary Variables

        int num1 = 10;
        int num2 = 5;

        num2 = num2 + num1;   // 5 + 10 = 15;
        num1 = num2 - num1;   // 15 - 10 = 5;
        num2 = num2 - num1;   // 15 - 5 = 10;



        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


/*

write a code to swap the values of 2 int variables without using a
temporary variable.
num1 = 10;
num2 = 5;

 */

    }

}
