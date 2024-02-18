package day13_practice_task.student;

public class CollegeStudent extends Student {

    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public CollegeStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty() || studentId.isBlank()) {
            System.err.println("Student ID cannot be empty, blank or null.");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()) {
            System.err.println("Field of study cannot be empty, blank or null.");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade < 'A' || grade > 'F'){
            System.err.println("Invalid input, please put a correct grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty() || schoolName.isBlank()) {
            System.err.println("Name of school cannot be empty, blank or null.");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println("Student " + getName() + " is studying " +  fieldOfStudy  + " in " + schoolName);
    }

    @Override
    public String toString() {
        return super.toString() +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

/*
2. Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).
 */