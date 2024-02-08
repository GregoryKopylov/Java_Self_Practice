package day05_practice_task;

public class FactorialNumber {

    public static void main(String[] args) {

        int num = 5;
        int result = 1;


        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial number of " + num + " = " + result);
    }
}

/*
5. Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
