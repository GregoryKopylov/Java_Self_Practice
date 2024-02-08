package day07_practice_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Greg";
        employee1.age = 39;
        employee1.gender = 'M';
        employee1.jobTitle = "President";
        employee1.salary = 150_000.00;

        employee1.work();

        System.out.println(employee1);

        System.out.println("______________________________________________________________________________");

        Employee employee2 = new Employee();
        employee2.name = "Nadia";
        employee2.age = 27;
        employee2.gender = 'F';
        employee2.jobTitle = "secretary";
        employee2.salary = 2000.00;

        employee2.work();

        System.out.println(employee2);

    }
}
