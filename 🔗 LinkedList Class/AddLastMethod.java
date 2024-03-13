import java.util.LinkedList;

public class AddLastMethod {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();

        // Adding elements to the LinkedList
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);

        // Adding the element 300 to the end of the LinkedList
        ll.addLast(300);

        // Printing the LinkedList after adding the element
        System.out.println(ll);
    }
}
