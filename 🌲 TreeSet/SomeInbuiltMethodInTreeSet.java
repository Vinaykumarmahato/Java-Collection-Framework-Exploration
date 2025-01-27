import java.util.TreeSet;

public class SomeInbuiltMethodInTreeSet {

    public static void main(String[] args) {

        
        // Creating a TreeSet
        TreeSet<Integer> ts = new TreeSet<>();

        // Adding elements to the TreeSet
        ts.add(10);
        ts.add(20);
        ts.add(40);
        ts.add(35);
        ts.add(5);

        // Printing the TreeSet
        System.out.println(ts); // Output: [5, 10, 20, 35, 40]

        // Attempting to add a duplicate value
        ts.add(40);
        System.out.println(ts); // Output: [5, 10, 20, 35, 40]
        // The value will not be printed since duplicates are not allowed

        // Using higher() to find the least element strictly greater than the given element
        System.out.println(ts.higher(20)); // Output: 35

        // Using lower() to find the greatest element strictly less than the given element
        System.out.println(ts.lower(20)); // Output: 10

        // Using ceiling() to find the least element greater than or equal to the given element
        System.out.println(ts.ceiling(55)); // Output: null (no such element)

        // Using floor() to find the greatest element less than or equal to the given element
        System.out.println(ts.floor(20)); // Output: 20
        System.out.println(ts.floor(9));  // Output: 5
    }
}
