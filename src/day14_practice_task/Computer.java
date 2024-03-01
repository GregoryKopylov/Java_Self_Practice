package day14_practice_task;

import day14_practice_task.device.Device;

public class Computer extends Device{

    public Computer(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn(){
        System.out.println("Press power button to turn on the computer " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff(){
        System.out.println("Press and hold power button to turn off the computer " + getBrand() + " " + getModel());
    }

    public void restart(){
        System.out.println("After installing new program restart the computer " + getBrand() + " " + getModel());
    }

}


/*
3. Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */