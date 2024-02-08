package day03_practice_task;

public class LogicalOperatorsAndBitwise {

    public static void main(String[] args) {

        int b = 2;
        boolean result = (++b == 2 || b == 2) && --b == 2;
        //                  3 == 2 || 3 == 2  &&  ------- ===> false
        //                 b = ++b = 3 AND after || ------

        System.out.println("result = " + result);
        System.out.println(b);

        int age = 23;

        boolean IsEligible = age >= 18 && age <= 65;

        System.out.println("Am I eligible to work? " + IsEligible);

        int appleCount = 5;
        int orangeCount = 2;
        int strawberryCount = 1;

        boolean record = appleCount < orangeCount || orangeCount >= strawberryCount;

        System.out.println("Record = " + record);

        double age1 = 20.0;

        boolean hasLearningPermit = true;
        boolean hasDriverLicence = false;

        boolean result1 = (age1 >= 18 && hasDriverLicence) || (age1 >= 15.5 && hasLearningPermit);

        System.out.println("Is Mike eligible to drive? " + result1);






    }


}
