import java.util.LinkedList;

public class SizeMethodExample {
    public static void main(String[] args) {
        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList();

        // Adding elements to the LinkedList
        ll.add(10);  // Adding element 10 to the end of the list
        ll.add(20);  // Adding element 20 to the end of the list
        ll.add(30);  // Adding element 30 to the end of the list

        // Printing the size of the LinkedList
        // size(): Returns the number of elements in the list.
        // Here, ll.size() returns 3 because there are three elements in the list.
        System.out.println(ll.size());// o/p = 3
    }
}
