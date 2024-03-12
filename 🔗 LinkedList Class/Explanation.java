import java.util.LinkedList;

public class Explanation {
    public static void main(String[] args) {

        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(400);
        ll1.add(500);
        ll1.add(600);

        System.out.println(ll1);
        System.out.println("-----------------------");

        LinkedList ll2 = new LinkedList();
        ll2.add("ADV Indian Coder");
        ll2.add(1000);
        ll2.add('V');
        ll2.add(1.1);
        System.out.println(ll2);

        // In collection it follow the Doubly LinkedList DS.Here the Data will be strore
        // in the node.

    }
}
