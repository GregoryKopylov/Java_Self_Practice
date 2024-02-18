package day13_practice_task.employee;

public class EmployeeClients {

    public static void main(String[] args) {

        Developer developer = new Developer("Jane Bole", 34, "Female", "ID 834634", "Developer", 207_000, "Cisco", "Java");
        System.out.println(developer);
        developer.work();

        System.out.println("______________________________________________________________________________________________________________________________");


        Tester tester = new Tester("Mike Smith", 27, "Male", "ID 457917", "SDET", 120_000, "Apple");
        System.out.println(tester);
        tester.work();

        System.out.println("______________________________________________________________________________________________________________________________");

        Teacher teacher = new Teacher("Elena Shevchenko", 32, "Female", "ID 712543", "Math teacher", 76000, "Prinston High School");
        System.out.println(teacher);
        teacher.work();

        System.out.println("______________________________________________________________________________________________________________________________");

        Driver driver = new Driver("Donald Duck", 44, "Male", "ID 612573", "Driver", 54000, "Disney");
        System.out.println(driver);
        driver.work();


    }
}

/*
3. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.

 */