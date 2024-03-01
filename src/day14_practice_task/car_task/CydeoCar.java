package day14_practice_task.car_task;

public final class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar(String model, String color, int year, double price) {
        super("Cydeo Car", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " " + getModel() + " parking itself if driver is drunk");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " driving to the work and back in auto pilot mode");
    }

    @Override
    public void start() {
        System.out.println("use voice control to start " + getMake() + " " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " can fly");
    }

}

/*
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
 */
