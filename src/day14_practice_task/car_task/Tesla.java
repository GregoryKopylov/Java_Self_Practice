package day14_practice_task.car_task;

import day14_practice_task.car_task.AutoPark;
import day14_practice_task.car_task.AutoPilot;
import day14_practice_task.car_task.Car;

public final class Tesla extends Car implements AutoPark, AutoPilot {

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " is parking in auto park mode");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is self driving without driver help");
    }

    @Override
    public void start() {
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road");
    }

}

/*
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
 */