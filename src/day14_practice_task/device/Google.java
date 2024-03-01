package day14_practice_task.device;

public class Google extends Phone implements Downloadable, AndroidApps{


    public Google(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading apps from " + AppStoreName);
    }
}

/*
- 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */