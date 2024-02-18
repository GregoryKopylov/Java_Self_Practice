package day13_practice_task.employee;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Name cannot be empty, blank or null.");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Age cannot be less or equal to zero");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isEmpty() || gender.isBlank()) {
            System.err.println("Gender cannot be empty, blank or null.");
            System.exit(1);
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

/*
Employee Task Requirements:
        1. Create a subclass of Person named "Employee" with the following specifications:
Attributes:
        - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

Encapsulation:
        - Same as previous tasks.

Constructor:
        - Same as previous tasks.

Methods:
        - work(): Displays the employee's job title and name.
        - toString(): Returns a string representation of the Employee object.

        2. Create the following subclasses of Employee:
        2.1 Tester:
        - work(): Displays "[jobTitle] [name] is testing".

        2.2 Developer:
        - Extra Variable:
        - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

        2.3 Teacher:
        - work(): Displays "[name] is teaching".

        2.4 Driver:
        - work(): Displays "[name] is driving".

        - Add any additional fields or methods as necessary.

        3. Create a class named "EmployeeClients":
        - Create multiple objects representing different employees.
        - Test the methods and attributes of each object.
 */