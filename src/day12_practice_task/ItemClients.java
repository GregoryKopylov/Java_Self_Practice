package day12_practice_task;

public class ItemClients {

    public static void main(String[] args) {
        
        Item item1 = new Item("Beer", 11.99, 4 );
        System.out.println("item1 = " + item1);
        
        Item item2 = new Item("Book", 20, 2);
        System.out.println("item2 = " + item2);
        
        Item item3 = new Item("$alup0", 0, -1);
        System.out.println("item3 = " + item3);
        
    }
}

/*
3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */