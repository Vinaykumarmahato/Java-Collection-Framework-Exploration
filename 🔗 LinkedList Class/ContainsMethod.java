import java.util.LinkedList;

public class ContainsMethod {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();

        // Adding elements to the LinkedList
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);

        // Checking if the LinkedList contains the element 400
        // This method returns true if the element is present, otherwise false.
        boolean contains400 = ll.contains(400);

        // Printing the result
        System.out.println("Does the list contain 400? " + contains400);
        
        // Note: The contains method does not modify the list, so ll remains unchanged.
        System.out.println(ll);
    }
}
