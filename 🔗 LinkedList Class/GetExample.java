import java.util.LinkedList;

public class GetExample {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();

        // Adding elements to the LinkedList
        ll.add(100);  // Adding element 100 to the end of the list
        ll.add(200);  // Adding element 200 to the end of the list
        ll.add(300);  // Adding element 300 to the end of the list
        ll.add(400);  // Adding element 400 to the end of the list

        // Retrieving and printing the element at index 2
        // get(int index): Returns the element at the specified position in the list.
        // Here, ll.get(2) returns the element at index 2, which is 300.
        System.out.println("Element at Index 2: " + ll.get(2));
    }
}
