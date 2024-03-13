import java.util.LinkedList;

public class IsEmptyMethod {
    public static void main(String[] args) {
        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList();

        // Adding elements to the LinkedList
        ll.add(10);  // Adding element 10 to the end of the list
        ll.add(20);  // Adding element 20 to the end of the list
        ll.add(30);  // Adding element 30 to the end of the list

        // Printing whether the LinkedList is empty or not
        // isEmpty(): Returns true if the list is empty, otherwise false.
        // Here, ll.isEmpty() returns false because the list is not empty.
        System.out.println(ll.isEmpty());
    }
}
