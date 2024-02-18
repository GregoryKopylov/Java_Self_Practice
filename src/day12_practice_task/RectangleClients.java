package day12_practice_task;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 4);
        System.out.println("rectangle1 = " + rectangle1);

        Rectangle rectangle2 = new Rectangle(5.5, 3.7);
        System.out.println("rectangle2 = " + rectangle2);

        Rectangle rectangle3 = new Rectangle(-5, 0);
        System.out.println("rectangle3 = " + rectangle3);





    }
}


/*
2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
 */