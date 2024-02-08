package day07_practice_task;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Nemiroff Honey Pepper";
        item1.unitPrice = 18;
        item1.quantity = 4;

        item1.calcCost();

        System.out.println(item1);

        System.out.println("___________________________________________________________________________________");

        Item item2 = new Item();
        item2.itemName = "Tort Kyivskyi";
        item2.unitPrice = 35;
        item2.quantity = 2;

        item2.calcCost();

        System.out.println(item2);

    }
}
