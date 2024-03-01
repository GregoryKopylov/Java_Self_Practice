package day14_practice_task.car_task;

import day14_practice_task.car_task.Car;

public final class Toyota extends Car {

    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Turn the key to ignition to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road.");
    }

}

/*
5. Create a Subclass of Car Named 'Toyota'.
6. Create a Subclass of Car Named 'Honda'.
7. Create a Subclass of Car Named 'BMW'.
 */