package day11_practice_task;

public class CarpetClients {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(5, 4, 20,true);
        Carpet carpet2 = new Carpet(10, 20, 8, false);
        Carpet carpet3 = new Carpet(100, 4, 8.99, false);
        Carpet carpet4 = new Carpet(2, 5, 1, true);

        System.out.println("carpet1 = " + carpet1);  //carpet1 = Carpet{width=5, length=4, unitPrice= $20.0, isPersian=true, Total price= $600.0}
        System.out.println("carpet2 = " + carpet2);  //carpet2 = Carpet{width=10, length=20, unitPrice= $8.0, isPersian=false, Total price= $1600.0}
        System.out.println("carpet3 = " + carpet3);  //carpet3 = Carpet{width=100, length=4, unitPrice= $8.99, isPersian=false, Total price= $3596.0}
        System.out.println("carpet4 = " + carpet4);  //carpet4 = Carpet{width=2, length=5, unitPrice= $1.0, isPersian=true, Total price= $210.0}
    }
}
