import java.util.PriorityQueue; // Importing the PriorityQueue class from the java.util package

public class Explanation { // Declaring a public class named Explanation

    public static void main(String[] args) { // Declaring the main method
        
        PriorityQueue pq = new PriorityQueue(); // Creating a new instance of PriorityQueue named pq

        // Adding elements to the PriorityQueue
        pq.add(125);
        pq.add(50);
        pq.add(75);
        pq.add(100);
        pq.add(100);
        pq.add(150);
        pq.add(175);
        System.out.println(pq);
        System.out.println("--------------------");

        pq.add(25);
        System.out.println(pq); // Duplicates allows here.

        // Printing the contents of the PriorityQueue pq

        System.out.println("--------------------");
// Not Allow Here Heterogenous data.
        // pq.add("Vinay Kumar");
        // System.out.println(pq);
        
        // Here the data will not be added in order and also won't be added in an unsorted way
        // It follows the min-heap Data Structure, which is why it is happening like this.

    }
}
