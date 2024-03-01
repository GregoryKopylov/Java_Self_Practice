package day14_practice_task.device;

public class DeviceShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple", "15ProMax", "256GB", 1299, "Space Gray", true, true);
        Samsung samsung = new Samsung("Samsung", "Galaxy S7", "256GB", 1199, "Black", true, true);
        Google google = new Google("Google", "Pixel 8", "128GB", 899, "Gray", true, true);
        Desktop desktop = new Desktop("Apple", "IMac", "27 inches", 1899, "Metallic", false, true);
        Laptop laptop = new Laptop("Lenovo", "Legion", "17 inches", 2499, "Black", true, true);
        PersonalComputer personalComputer = new PersonalComputer("Dell", "Bimba", "24 inches", 569, "White", false, true);

        test(iphone);
        test(samsung);
        test(google);
        test(desktop);
        test(laptop);
        test(personalComputer);

        iphone.downloadApp();
        iphone.turnOn();

        samsung.downloadApp();
        samsung.turnOn();
        samsung.turnOn();

        laptop.restart();
        laptop.turnOff();

        desktop.turnOff();
        desktop.turnOn();
        desktop.restart();

        iphone.call(2129156667);
        samsung.text(2128752542);
        google.call(911);
        google.text(2141112222);

    }

    private static void test(Device device) {
        System.out.println("Testing " + device.getClass().getSimpleName() + ":");

        device.turnOn();
        device.turnOff();

        System.out.println("Device information: " + device);

        if (device instanceof Downloadable) {
            System.out.println("Device is downloadable. Attempting to download an app...");
            ((Downloadable) device).downloadApp();
            System.out.println("Download completed.");
        }
        if (device instanceof AndroidApps) {
            AndroidApps androidDevice = (AndroidApps) device;
            System.out.println("App Store Name: " + androidDevice.AppStoreName);
            System.out.println("OS: " + androidDevice.OS);
        }
        if (device instanceof AppleApps) {
            AppleApps appleDevice = (AppleApps) device;
            System.out.println("App Store Name: " + appleDevice.AppStoreName);
            System.out.println("OS: " + appleDevice.OS);
        }
        System.out.println();
    }

}

/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */