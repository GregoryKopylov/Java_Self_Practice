package day13_practice_task.state;

public class StateClients {

    public static void main(String[] args) {

        California california = new California("California", "CA", "Democratic Party", "Gavin Newsom", "Alex Padilla", 39_510_000);
        Florida florida = new Florida("Florida", "FL", "Republican Party", "Ron DeSantis", "Marco Rubio", 21_480_000);
        Texas texas = new Texas("Texas", "TX", "Republican Party", "Greg Abbott", "Ted Cruz", 29_000_000);
        Virginia virginia = new Virginia("Virginia", "VA", "Republican Party", "Glenn Youngkin", "Mark Warner", 8_536_000);


        System.out.println(california);
        System.out.println();
        System.out.println(florida);
        System.out.println();
        System.out.println(texas);
        System.out.println();
        System.out.println(virginia);

    }

}

/*
State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.

2. Create the following subclasses of the State class:
      - Virginia
      - California
      - Texas
      - Florida
   - Add any additional fields and methods as necessary.

3. Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.
 */