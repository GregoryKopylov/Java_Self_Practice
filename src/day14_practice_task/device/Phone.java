package day14_practice_task.device;

public abstract class Phone extends Device{

    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Press and hold power button to turn on the phone " + getBrand() + " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press and hold power button to turn off the phone " + getBrand() + " " + getModel());
    }

    public void call(long phoneNum){
        System.out.println("Calling: " + phoneNum );
    }

    public void text (long phoneNum){
        System.out.println("Texting: " + phoneNum);
    }

    @Override
    public String toString() {
        return super.toString() + " Phone{}";
    }
}

/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */