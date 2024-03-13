import java.util.LinkedList;

public class PollMethod {
    
    public static void main(String[] args) {
        
        // Creating a LinkedList object named ll
        LinkedList<Integer> ll = new LinkedList<>();
        
        // Adding elements to the LinkedList
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        // Retrieving and removing the first element of the LinkedList
        // Output will be the first element, which is 10, and it will also be removed from the list
        System.out.println(ll.poll());
    }
}
