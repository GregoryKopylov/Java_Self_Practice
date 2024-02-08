package day07_practice_task;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");

        double radius = input.nextDouble();

        input.close();

        double perimeter = (radius * 3.14) * 2;
        System.out.println("The perimeter of the Circle = " + perimeter);

        double area = (radius * radius) * 3.14;
        System.out.println("The area of the Circle = " + area);

    }
}


