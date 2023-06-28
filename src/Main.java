//Define a testing class with a main() method where you:
//    - create an HashSet with all the days of the week and print the content of the HashSet
//    - create another implementation of Set that preserves the insertion order of the days of the week and print it
//    - print the new Set
//    - print the answer to the question Is the first Set equal to the second one?

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //- create an HashSet with all the days of the week and print the content of the HashSet
        Set<String> days = new HashSet<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        for(String day : days) {
            System.out.println(day);
        }
        System.out.println(" ");

        //- create another implementation of Set that preserves the insertion order of the days of the week and print it
        Set<String> daysByInsertion = new LinkedHashSet<>();
        daysByInsertion.add("Monday");
        daysByInsertion.add("Tuesday");
        daysByInsertion.add("Wednesday");
        daysByInsertion.add("Thursday");
        daysByInsertion.add("Friday");
        daysByInsertion.add("Saturday");
        daysByInsertion.add("Sunday");

        for(String dayByInsertion : daysByInsertion) {
            System.out.println(dayByInsertion);
        }

        boolean checkIfEquals = days.equals(daysByInsertion);
        System.out.println("\nIs the first Set equal to the second one? " + checkIfEquals);
    }
}