import java.util.LinkedList;

public class SizeMethod {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();

        // Adding elements to the LinkedList
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);

        // Retrieving the size of the LinkedList
        int size = ll.size();

        // Printing the size
        System.out.println("Size of the LinkedList: " + size);

        // Note: The size method does not modify the list, so ll remains unchanged.
        System.out.println(ll);
        /*
         * Output:
         * Size of the LinkedList: 4
         * [100, 200, 300, 400]
         */
    }
}
