import java.util.*; // Import the ArrayList class from the java.util package

// Define a class named 'MoreOnArrayList1'
public class MoreOnArrayList1 {
    
    // Main method where the program execution begins
    public static void main(String[] args) {

        // Create an ArrayList 'al1' to store integers
        ArrayList al1 = new ArrayList();

        // Add elements to 'al1'
        al1.add(100); // Add integer 100
        al1.add(200); // Add integer 200
        al1.add(300); // Add integer 300

        // Print the contents of 'al1'
        System.out.println(al1);

        // Print a separator line
        System.out.println("----------------------");

        // Check if 'al1' contains the element '100' and print the result
        System.out.println("Lets Check Contains method");
        System.out.println("Does the list contain 100? " + al1.contains(100));

        // Check if 'al1' contains the element '10000' and print the result
        System.out.println("Does the List Contains 10000> " + al1.contains(10000));
        System.out.println("----------------------");

        // Check the index of element '300' in 'al1' and print it
        System.out.println("Lets Check IndexOff method");
        System.out.println("The Index number of 300 is:- " + al1.indexOf(300));
        System.out.println("----------------------");

        // Check the size of 'al1' after adding more elements and print it
        System.out.println("Lets Check Size method");
        al1.add(100); // Add another integer 100
        al1.add(200); // Add another integer 200
        al1.add(900); // Add integer 900
        System.out.println(al1);
        System.out.println("The size of List is:- " + al1.size());
        System.out.println("----------------------");

        // Create another ArrayList 'al2' and ensure a minimum capacity of 100
        System.out.println("Lets Check EnsureCapacity method");
        ArrayList al2 = new ArrayList();
        al2.add(1); // Add integer 1
        al2.add(2); // Add integer 2
        al2.add(3); // Add integer 3
        al2.add(4); // Add integer 4
        al2.ensureCapacity(100); // Ensure a minimum capacity of 100
        System.out.println("The Capacity of the List is:- " + al2);

        // Create a third ArrayList 'al3', ensure a minimum capacity, and trim the size
        ArrayList al3 = new ArrayList();
        al3.add(10); // Add integer 10
        al3.add(30); // Add integer 30
        al3.ensureCapacity(10); // Ensure a minimum capacity of 10
        al3.trimToSize(); // Trim the capacity of the ArrayList to the list's current size
        System.out.println(al3);

        
    }
}
