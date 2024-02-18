package day13_practice_task.employee;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isEmpty() || programmingLanguage.isBlank()) {
            System.err.println("Programming language cannot be empty, blank or null.");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + getProgrammingLanguage() + ".");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "} " + super.toString();
    }

}

/*
2.2 Developer:
          - Extra Variable:
              - programmingLanguage: String
          - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */