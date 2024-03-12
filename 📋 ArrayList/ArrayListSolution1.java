import java.util.*;

public class ArrayListSolution1 {

    public static void main(String[] args) {

        // Creating an ArrayList named 'All' to store integers
        ArrayList All = new ArrayList<>();
        All.add(100);
        All.add(200);
        All.add(300);
        All.add(400);
        
        // Printing the elements of the 'All' ArrayList
        System.out.println("Elements in 'All': " + All); // Output: [100, 200, 300, 400]
        System.out.println("-----------------------------------");

        // Creating another ArrayList named 'Al1' to store heterogeneous data types
        ArrayList Al1 = new ArrayList();
        Al1.add("ADV Indian Coder");
        Al1.add(100);
        Al1.add(1.1);
        Al1.add('J');

        // Printing the elements of the 'Al1' ArrayList
        System.out.println("Elements in 'Al1': " + Al1); // Output: [ADV Indian Coder, 100, 1.1, J]

        System.out.println("-----------------------------------");

        // Creating a new ArrayList named 'al2' to store integers
        System.out.println("Before Adding the Collection");
        ArrayList al2 = new ArrayList();
        al2.add(1);
        al2.add(2);
        al2.add(3);

        // Printing the elements of the 'al2' ArrayList
        System.out.println("Elements in 'al2': " + al2); // Output: [1, 2, 3]

        System.out.println("After Adding the Collection");

        // Adding all elements of 'Al1' to 'al2'
        al2.addAll(Al1);
        // Printing the elements of 'al2' after adding the collection
        System.out.println("Elements in 'al2' after adding the collection: " + al2); // Output: [1, 2, 3, ADV Indian Coder, 100, 1.1, J]

        System.out.println("-----------------------------------");

        // Adding an element at a specific index in 'al2'
        System.out.println("After Adding at a specific index in the Collection");

        al2.add(2, "Vinay Bhai");
        // Printing the elements of 'al2' after adding at a specific index
        System.out.println("Elements in 'al2' after adding at a specific index: " + al2);
        // Output: [1, 2, Vinay Bhai, 3, ADV Indian Coder, 100, 1.1, J]
        System.out.println("-----------------------------------");

        // Index-based Accessing is allowed here, but index-based insertion is not preferred
        // because it involves shifting values, making it inefficient.
        
        // Index-based insertion is allowed but not preferred.
        
        // Duplicates values are allowed in ArrayLists.

        // Creating another ArrayList named 'vinay' to store integers
        ArrayList vinay = new ArrayList();
        vinay.add(100);
        vinay.add(200);
        vinay.add(300);
        // Printing the elements of the 'vinay' ArrayList
        System.out.println("Elements in 'vinay': " + vinay); // Output: [100, 200, 300]

        // Adding a duplicate value to 'vinay'
        System.out.println("Adding a duplicate value to 'vinay'");

        vinay.add(300);
        // Printing the elements of 'vinay' after adding a duplicate value
        System.out.println("Elements in 'vinay' after adding a duplicate value: " + vinay); // Output: [100, 200, 300, 300]
        System.out.println("-----------------------------------");

    }

}
