import java.util.LinkedList;

public class Revision1 {

    public static void main(String[] args) {

        // Creating a LinkedList object named ll
        LinkedList ll = new LinkedList();
        // Homogeneous Example of LinkedList Class
        ll.add(10);  // Adding integer value 10 to the LinkedList
        ll.add(20);  // Adding integer value 20 to the LinkedList
        ll.add(30);  // Adding integer value 30 to the LinkedList

        System.out.println(ll);  // Printing the content of ll

        System.out.println("----------------------------");

        // Creating another LinkedList object named ll2
        LinkedList ll2 = new LinkedList();
        // Heterogeneous Example of LinkedList Class
        ll2.add("ADV Indian Coder");  // Adding string value "ADV Indian Coder" to the LinkedList
        ll2.add('J');                  // Adding character 'J' to the LinkedList
        ll2.add(2.23);                 // Adding double value 2.23 to the LinkedList

        System.out.println(ll2);  // Printing the content of ll2

        // Remember it also implements DeQueue Interface that's why it will have more
        // methods from ArrayList.

        /* This Data will be stored in a DoublyLinkedList Apaches */

        // Creating another LinkedList object named ll3
        LinkedList ll3 = new LinkedList();

        ll3.add(10);  // Adding integer value 10 to the LinkedList
        ll3.add(20);  // Adding integer value 20 to the LinkedList
        ll3.add(30);  // Adding integer value 30 to the LinkedList

        ll3.addFirst("Vinay");        // Adding string "Vinay" to the beginning of the LinkedList
        System.out.println(ll3);

        ll3.addLast("Java Developer"); // Adding string "Java Developer" to the end of the LinkedList
        System.out.println(ll3);

        ll3.add(2, 10000);             // Adding integer value 10000 at index 2 in the LinkedList
        System.out.println(ll3);

        // In LinkedList, data will not be added in shifting format.
        // Here, without affecting the memory, we can perform the insertion and deletion at our choice index.

        System.out.println(ll3.peek());  // Retrieving the first element of the LinkedList without removing it

        System.out.println(ll3);

        System.out.println(ll3.poll());  // Retrieving and removing the first element of the LinkedList
        System.out.println(ll3);
    }
}
