package day03_practice_task;

public class PrePostIncrementsTask2 {

    public static void main(String[] args) {

        int a = 10;

        a = --a + a++ + a-- + a++;
        //=   9 + 9   + 10  + 9    = 37.
        //= --9 = 9.  a++ = 9 (+1 for next step). a-- = 10 (-1 for next step). a++ = 9.


        System.out.println("a = " + a);

        int x = 4;
        int y = --x * 4 - x++;
        //       3  * 4 - 4   = 12 - 4 = 9.

        System.out.println("x = " + x);  // x = 4. no calculations happened to x.
        System.out.println("y = " + y);





    }
}
