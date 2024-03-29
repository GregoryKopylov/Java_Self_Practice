package day06_practice_task;

import day04_practice_task.MonthName;

public class DayAndMonth {

    public static void main(String[] args) {

        day(5);
        monthName(6);
        daysInMonth(6);


    }

    public static void day(int day) {
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");

        }
    }

    public static void monthName(int month) {
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month");
        }
    }


    static public void daysInMonth(int month) {
        switch (month) {
            case 1 -> System.out.println("January has 31 days");
            case 2 -> System.out.println("February has 28 days");
            case 3 -> System.out.println("March has 31 days");
            case 4 -> System.out.println("April has 30 days");
            case 5 -> System.out.println("May has 31 days");
            case 6 -> System.out.println("June has 30 days");
            case 7 -> System.out.println("July has 31 days");
            case 8 -> System.out.println("August has 31 days");
            case 9 -> System.out.println("September has 30 days");
            case 10 -> System.out.println("October has 31 days");
            case 11 -> System.out.println("November has 30 days");
            case 12 -> System.out.println("December has 31 days");
            default -> System.out.println("Invalid month");

        }
    }
}




/*
4. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */