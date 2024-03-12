import java.util.ArrayList; // Importing ArrayList class from java.util package

public class ArrayListSolution3 { // Creating a class named ArrayListSolution3

    public static void main(String[] args) { // Main method

        ArrayList al1 = new ArrayList(); // Creating an ArrayList object named al1

        al1.add(100); // Adding 100 to the ArrayList
        al1.add(200); // Adding 200 to the ArrayList
        al1.add(300); // Adding 300 to the ArrayList
        al1.add(400); // Adding 400 to the ArrayList

        System.out.println(al1); // Printing the ArrayList
        System.out.println("----------------------");

        al1.add(0, "Vinay Kumar"); // Adding "Vinay Kumar" at index 0
        System.out.println(al1); // Printing the ArrayList
        System.out.println("-----------------------");

        // Checking if ArrayList contains 300
        al1.contains(300);
        System.out.println(al1); // Printing the ArrayList (true)

        System.out.println("-----------------------");

        // Getting the index of 400
        int index = al1.indexOf(400);
        System.out.println(index); // Printing the index of 400

        System.out.println("---------------------------");

        al1.size(); // Getting the size of the ArrayList
        System.out.println(al1); // Printing the ArrayList
        System.out.println("--------------------------");

        al1.ensureCapacity(10); // Ensuring the capacity of ArrayList to 10
        System.out.println("Here the Default capacity that i have given 10 but in used there are few index not 100");

        System.out.println("--------------------------");

        al1.trimToSize(); // Reducing the capacity of ArrayList to its current size
        System.out.println("here the ensure size has remove by using trimToSize KeyWords");
        System.out.println("---------------------------------");
        // here the ensure size has remove by using trimToSize KeyWords

    }
}
