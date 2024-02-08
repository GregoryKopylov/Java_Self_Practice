package day03_practice_task;

public class PrePostIncrements {

    public static void main(String[] args) {

        int x = 2;
        int y = x++;

        System.out.println("y = " + y);  // 2

        int a = 2;

        System.out.println("a = " + a++); // 2

        int b = 2;

        System.out.println("b = "  + --b); // 1

        int c = 8;
        int d = c--;

        System.out.println("d = " + d); // 8



    }


}
