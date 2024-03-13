import java.util.LinkedList;

public class AddFirstMethod {
    
    public static void main(String[] args) {
        
        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();
        
        // Adding elements to the LinkedList
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        // Adding the element 20 to the beginning of the LinkedList
        ll.addFirst(20);

        // Printing the LinkedList after adding the element
        System.out.println(ll);
    }
}
