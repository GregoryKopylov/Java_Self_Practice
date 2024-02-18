package day12_practice_task;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Radius can not be negative or 0");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double area (){
        return radius * radius * PI;
    }

    public double perimeter(){
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';

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