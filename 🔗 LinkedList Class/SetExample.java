import java.util.LinkedList;

public class SetExample {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList();

        // Adding elements to the LinkedList
        ll.add(100);  // Adding element 100 to the end of the list
        ll.add(200);  // Adding element 200 to the end of the list
        ll.add(300);  // Adding element 300 to the end of the list
        ll.add(400);  // Adding element 400 to the end of the list

        System.out.println("Original LinkedList: " + ll);

        // set(int index, E element): Replaces the element at the specified position in the list with the specified element.
        // Here, ll.set(1, 500) replaces the element at index 1 with 500.
        ll.set(1, 500);

        System.out.println("LinkedList after replacing element at index 1: " + ll);
    }
}
// Original LinkedList: [100, 200, 300, 400]
// LinkedList after replacing element at index 1: [100, 500, 300, 400]