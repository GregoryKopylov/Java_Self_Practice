package day13_practice_task.student;

public class CydeoCollegeStudent extends CollegeStudent {

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoCollegeStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("Batch number cannot be less or equal to zero");
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (batchNumber <= 0){
            System.err.println("Group number cannot be less or equal to zero");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
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
    public void study(){
        super.study();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}


/*
  3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.
 */