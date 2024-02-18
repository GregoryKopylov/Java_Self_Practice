package day13_practice_task.student;

public class StudentClients {

    public static void main(String[] args) {

        Student student1 = new Student("Gregory Kopylov", 40, "Male");
        System.out.println(student1);

        System.out.println("_____________________________________________________________________________________________________________________________________________________");

        CollegeStudent student2 = new CollegeStudent("Nadia Dumenko", 27, "Female", "ID 441234", "Philosophy", 'A', "Harvard");
        System.out.println(student2);
        student2.study();

        System.out.println("_____________________________________________________________________________________________________________________________________________________");


        GraduateCollegeStudent student3 = new GraduateCollegeStudent("Pavel Neryanov", 40, "Male", "ID 123654", "Cosmic Science", 'F', "Prinston");
        System.out.println(student3);
        student3.study();
        student3.resting();

        System.out.println("_____________________________________________________________________________________________________________________________________________________");

        UndergraduateCollegeStudent student4 = new UndergraduateCollegeStudent("Mike Smith", 21, "Male", "ID 456827", "Biology", 'B', "UPenn");
        System.out.println(student4);
        student4.goingClub();
        student4.playing();
        student4.study();

        System.out.println("_____________________________________________________________________________________________________________________________________________________");

        CydeoCollegeStudent student5 = new CydeoCollegeStudent("Gregory Kopylov",40, "Male", "ID 444666", "SDET", 'A', "CYDEO", 33, 12, "JAVA");
        System.out.println(student5);
        student5.study();



    }

}

/*
4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.
 */
