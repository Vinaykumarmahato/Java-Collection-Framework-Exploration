import java.util.LinkedList;

public class RemoveFirstExample {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();

        // Adding elements to the LinkedList
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.removeFirst();

        // removeFirst(): Removes and returns the first element of the list.
        System.out.println("Removed First Element: " + ll);
    }
}
// Output: Removed First Element: 100
// LinkedList after removing first element: [200, 300, 400]