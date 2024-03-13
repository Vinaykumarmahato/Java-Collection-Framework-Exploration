import java.util.LinkedList;

public class removeMethod {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();

        // Adding elements to the LinkedList
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);

        System.out.println("Original LinkedList: " + ll);

        // Removing an element at index 2
        ll.remove(2);

        System.out.println("LinkedList after removing element at index 2: " + ll);
    }
}
