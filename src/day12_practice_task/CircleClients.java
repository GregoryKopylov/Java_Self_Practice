package day12_practice_task;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.setRadius(20);
        System.out.println(circle1);

        circle2.setRadius(10);
        System.out.println(circle2);

        circle3.setRadius(-10);
        System.out.println(circle3);

    }
}


/*
1. Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.
 */