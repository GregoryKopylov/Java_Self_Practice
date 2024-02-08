package day07_practice_task;

public class Address {

    public int buildingNumber;
    public String street, city, state, zipCode;
//    public String city;
//    public String state;
//    public String zipCode;

    public void address (){
        System.out.println(buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode );
    }


    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
