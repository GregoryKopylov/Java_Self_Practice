package day04_practice_task;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        if ((a >= b && a <= c) || (a <= b && a >= c) ) {
            System.out.println("Median Number is " + a);
        }
        else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println("Median number is " + b);
        }
        else {
            System.out.println(c);

        }
    }
}

/*      NOT SURE IF THIS IS RIGHT BCZ I DIDN'T FINISH IT MYSELF
4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */