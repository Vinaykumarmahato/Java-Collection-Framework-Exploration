import java.util.LinkedList;

public class PeekMethod {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList();

        // Adding elements to the LinkedList
        ll.add(10000);
        ll.add(200000);
        ll.add(300000);

        // Printing the result of ll.peek()
        System.out.println(ll.peek()); // peek() method in the LinkedList class is used to retrieve, but not remove,
                                       // the first element of the list. It returns the head (first element) of the
                                       // list, or null if the list is empty.

        // op is used to take the first object of the interface, o/p = 10000
    }
}

// Explanation:

// import java.util.LinkedList;: Importing the LinkedList class from the
// java.util package.
// public class PeekMethod { ... }: Defining a class named PeekMethod.
// public static void main(String[] args) { ... }: The main method, where the
// execution of the program begins.
// LinkedList ll = new LinkedList();: Creating a new LinkedList object named ll.
// ll.add(10000);, ll.add(200000);, ll.add(300000);: Adding three integer
// elements to the LinkedList.
// System.out.println(ll.peek());: Using the peek() method to retrieve the first
// element of the LinkedList without removing it, and printing the result.
// The comment // op is used to take first object of interface o/p = 10000
// explains the purpose of the code snippet.
// So, the output of this program would be 10000, which is the first element
// added to the LinkedList.