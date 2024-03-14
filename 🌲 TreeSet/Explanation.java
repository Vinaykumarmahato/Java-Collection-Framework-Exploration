import java.util.TreeSet;

public class Explanation {
    
    public static void main(String[] args) {
        
        TreeSet t = new TreeSet<>();
        t.add(100);
        t.add(23);
        t.add(9);
        t.add(90);
        t.add(877);
        t.add(45);
        
        System.out.println(t);
        // It stores the data in a Binary Search Tree way.
        // The data will be in sorted order.

        // output:
        // [9, 23, 45, 90, 100, 877]
    }
}
