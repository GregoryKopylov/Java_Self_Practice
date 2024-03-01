package day14_practice_task.car_task;

public final class BMW extends Car {

    public BMW( String model, String color, int year, double price) {
        super("BMW", model, year, price, color);
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


