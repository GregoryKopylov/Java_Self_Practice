package day13_practice_task.employee;

public class Employee extends Person {

    private String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.isEmpty() || employeeId.isBlank()) {
            System.err.println("Emloyee ID cannot be empty, blank or null.");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Job title cannot be empty, blank or null.");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.err.println("Salary must be greater than zero");
            System.exit(1);
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.isEmpty() || companyName.isBlank()) {
            System.err.println("Name cannot be empty, blank or null.");
            System.exit(1);
        }
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + getName() + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}' + super.toString();
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