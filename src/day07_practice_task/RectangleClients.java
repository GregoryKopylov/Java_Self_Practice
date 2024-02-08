package day07_practice_task;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 10.0;
        rectangle1.length = 5.0;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);

        System.out.println("_______________________________________________________________");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 14.88;
        rectangle2.length = 11.11;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();

        System.out.println(rectangle2);

    }
}
