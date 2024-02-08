package day07_practice_task;

public class AddressClient {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber = 7925;
        address1.street = "Jones Branch Dr";
        address1.city = "McClean";
        address1.state = "VA";
        address1.zipCode = "22012";

        address1.address();

        System.out.println(address1);

        System.out.println("______________________________________________________________________________________");

        Address address2 = new Address();
        address2.buildingNumber = 11;
        address2.street = "M Lushpy st";
        address2.city = "Sumy";
        address2.state = "Sumskyi Region";
        address2.zipCode = "40035";

        address2.address();

        System.out.println(address2);


    }
}
