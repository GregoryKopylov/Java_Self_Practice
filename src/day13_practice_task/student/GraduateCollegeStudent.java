package day13_practice_task.student;

public class GraduateCollegeStudent extends CollegeStudent {

    public GraduateCollegeStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }
    @Override
    public void study(){
        super.study();
    }
    public void resting(){
        System.out.println(getName() + " is resting after studying");
    }

}

/*
3. Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.
 */