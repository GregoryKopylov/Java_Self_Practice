package day08_practice_task;

public class ChuckNorris {

    public static void main(String[] args) {

        String name = "chuck norris";
        name = name.substring(0,1).toUpperCase() + "." + name.substring(6,7).toUpperCase() + "." ;

        System.out.print(name);

    }
}


/*
Enter two word. Print out only first letter from each word in upper case without space with '.' between.
Example input: "chuck norris", output: C.N.
 */