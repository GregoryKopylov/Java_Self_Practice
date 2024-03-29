package day11_practice_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Mike", 35, 'M', "CM", 100_000);
        Employee employee2 = new Employee("Alesia", 25, 'F', "Quality manager", 82_000);

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);

        employee1.work(); // CM Mike is working.
        employee2.work(); // Quality manager Alesia is working.

    }
}

/*
3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */