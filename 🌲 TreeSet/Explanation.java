import java.util.TreeSet;

public class Explanation {


    public static void main(String[] args) {

        TreeSet t = new TreeSet<>();
        t.add(100);
        t.add(50);
        t.add(150);
        t.add(25);
        t.add(75);
        t.add(125);
        t.add(175);
        System.out.println(t);

        // The Output is: [25, 50, 75, 100, 125, 150, 175]

        // In TreeSet, it follows the Binary Search Tree DS. Here the Data will
        // be stored in the node.
        /*
         * Algorithm:
         * 1. First element will be the root node.
         * 
         * 2. If the next element is less than the root node then it will be the left
         * child of the root node.
         * 
         * 3. If the next element is greater than the root node then it will be the
         * right child of the root node.
         * 
         * 4. If the next element is less than the left child then it will be the left
         * child of the left child.
         * 
         * 5. If the next element is greater than the right child then it will
         * be the right child of the right child.
         * 
         * 6. If the next element is less than the right child and greater than the
         * left child then it will be the right child of the left child.
         * 
         * 7. If the next element is greater than the left child and less than the
         * right child then it will be the left child of the right child.
         * 
         * 8. The above process will be repeated until the last element.
         * 
         * 9. The output will be in the sorted order.
         * 
         * Creating A tree of these example:
         * 
         *            100
         *           /   \
         *         50    150
         *        / \    / \
         *      25  75  125 175
         * 
         */

    }
}
