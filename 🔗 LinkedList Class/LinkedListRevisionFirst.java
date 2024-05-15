import java.util.*; // Import the LinkedList class from the java.util package

// Define a class named 'LinkedListRevisionFirst'
public class LinkedListRevisionFirst {
    
    // Main method where the program execution begins
    public static void main(String[] args) {

        // Create a LinkedList 'll' to store integers
        LinkedList ll = new LinkedList();
        

        // Add elements to 'll'
        ll.add(10); // Add integer 10
        ll.add(20); // Add integer 20
        ll.add(50); // Add integer 50
        ll.add(40); // Add integer 40

        // Print the contents of 'll'
        System.out.println(ll);
        System.out.println("----------------------");

        // Create another LinkedList 'll2' to store various types of elements
        LinkedList ll2 = new LinkedList();
        ll2.add("Vinay"); // Add a String "Vinay"
        ll2.add(10); // Add integer 10
        ll2.add(10.2); // Add a double 10.2
        ll2.add('A'); // Add a character 'A'

        // Print the contents of 'll2'
        System.out.println(ll2);
        System.out.println("----------------------");

        // Create a third LinkedList 'll3' to demonstrate the poll method
        LinkedList ll3 = new LinkedList();
        ll3.add(10); // Add integer 10
        ll3.add(30); // Add integer 30
        ll3.add(50); // Add integer 50
        ll3.poll(); // Remove the first element from 'll3'

        // Print the contents of 'll3' after polling
        System.out.println(ll3);
        System.out.println("----------------------");

        // Poll again to remove the next first element
        ll3.poll();
        // Print the contents of 'll3' after the second poll
        System.out.println(ll3);
        System.out.println("----------------------");

        // Peek at the first element of 'll3' without removing it
        System.out.println("The first element is: " + ll3.peek());
        System.out.println("----------------------");
    }
}
