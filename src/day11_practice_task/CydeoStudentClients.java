package day11_practice_task;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent.schoolName = "Cydeo School";
        CydeoStudent.programmingLanguage = "JAVA";

        CydeoStudent student1 = new CydeoStudent("Audra", 35, 301, 4.7, 33, 7);
        CydeoStudent student2 = new CydeoStudent("Seima", 26, 111, 4.9, 33, 12);


        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
        System.out.println(student1);
        student1.study();
        student1.attendClass();
        System.out.println(student2);
        student2.study();
        student2.attendClass();


    }
}


/*
4. Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.
 */
