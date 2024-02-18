package day12_practice_task;

public class CandyClients {

    public static void main(String[] args) {
        
        Candy candy1 = new Candy("Roshen", 100, 8.99, false);
        System.out.println("candy1 = " + candy1);
        
        Candy candy2 = new Candy("AVK", 60, 4.99, true);
        System.out.println("candy2 = " + candy2);
        
        Candy candy3 = new Candy("Hershy", 8, 0, false);
        System.out.println("candy3 = " + candy3);

        Candy candy4 = new Candy("Korona", 0, -2, true);
        System.out.println("candy4 = " + candy4);
        
    }
}
