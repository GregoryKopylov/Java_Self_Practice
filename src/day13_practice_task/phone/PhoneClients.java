package day13_practice_task.phone;

public class PhoneClients {

    public static void main(String[] args) {
        
        IPhone iPhone = new IPhone("IPhone", "15 Max Pro", "Max", 1299, "Black");
        System.out.println(iPhone);
        System.out.println("IPhone:");
        iPhone.call("215-915-6666");
        iPhone.text("215-915-6666");
        iPhone.faceTime("215-915-6666");

        System.out.println("_______________________________________________________________________________________");

        Samsung samsung = new Samsung("Samsung", "Galaxy S7", "Small", 990.99, "Grey");
        System.out.println(samsung);
        System.out.println("Samsung:");
        samsung.call("911");
        samsung.text("267-301-1488");

        System.out.println("_______________________________________________________________________________________");

        Nokia nokia = new Nokia("Nokia", "6610", "Default", 399, "Blue");
        System.out.println(nokia);
        System.out.println("Nokia:");
        nokia.call("215-816-6660");
        nokia.text("609-509-3363");

    }
}

/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */