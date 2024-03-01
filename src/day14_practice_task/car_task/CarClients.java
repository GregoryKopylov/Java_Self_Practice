package day14_practice_task.car_task;

public class CarClients {

    public static void main(String[] args) {

        Audi audi = new Audi("A8", "Gunmetal gray", 2022, 96_920);
        System.out.println(audi);
        audi.start();
        audi.stop();
        audi.autoPark();

        BMW bmw = new BMW("M3", "Lagoona Blue", 2004, 27_000);
        System.out.println(bmw);
        bmw.start();
        bmw.drive();
        bmw.stop();

        CydeoCar cydeoCar = new CydeoCar("B33", "Poison Green", 2024, 76777);
        System.out.println(cydeoCar);
        cydeoCar.fly();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.start();

        Tesla tesla = new Tesla("Model 3", "Pink", 2021, 29000);
        tesla.drive();
        tesla.stop();
        tesla.selfDrive();
        tesla.autoPark();

    }

}

/*

11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.

 */
