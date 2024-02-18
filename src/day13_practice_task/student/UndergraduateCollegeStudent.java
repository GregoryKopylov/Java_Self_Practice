package day13_practice_task.student;

public class UndergraduateCollegeStudent extends CollegeStudent {

    public UndergraduateCollegeStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study(){
        super.study();
    }

    public void playing(){
        System.out.println(getName() + " is playing soccer in " + getSchoolName() + " team.");
    }

    public void goingClub(){
        System.out.println(getName() + " is going club every Friday night");
        if(getAge() < 21){
            System.err.println(getName() + " is underage and cannot go to the club");
        }

    }


}

/*
 3.2 UndergraduateStudent:
            - Same as GraduateStudent.

 */