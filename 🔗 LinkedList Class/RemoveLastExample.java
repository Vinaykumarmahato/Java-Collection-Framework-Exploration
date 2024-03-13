import java.util.LinkedList;

public class RemoveLastExample {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList<>();

        // Adding elements to the LinkedList
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.removeLast();
        System.out.println("Removed Last Element: " + ll);
        // o/p= 100,200,300
    }
}