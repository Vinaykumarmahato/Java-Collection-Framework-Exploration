import java.util.LinkedList;

public class ClearMethod {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(34);
        ll.add(56);
        ll.add(67);

        System.out.println(ll);

        System.out.println("----------------------");
        ll.clear();
        System.out.println(ll);

        // Ouput:

        // [34, 56, 67]
        // ----------------------
        // []

    }
}
