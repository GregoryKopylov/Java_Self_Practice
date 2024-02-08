package day06_practice_task;

public class SalaryCalculator {

        public static void main(String[] args) {
            double income = 52 * salary(45,40);
            System.out.println(income);
        }

        public static double salary(double hourlyRate, int weeklyHours){
            double salary = hourlyRate * weeklyHours;
            return salary;
        }
    }