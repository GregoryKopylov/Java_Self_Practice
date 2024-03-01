package day14_practice_task.car_task;

import day14_practice_task.car_task.AutoPark;
import day14_practice_task.car_task.AutoPilot;
import day14_practice_task.car_task.Car;

public final class Nio extends Car implements AutoPilot, AutoPark {

    public Nio(String model, String color, int year, double price) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " in auto park mode");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is in self drive mode");
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
