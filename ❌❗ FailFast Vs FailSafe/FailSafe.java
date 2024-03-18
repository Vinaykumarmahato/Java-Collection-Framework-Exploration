import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println("ArrayList: " + al);

        // CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> cp = new CopyOnWriteArrayList<>();
        cp.add(10);
        cp.add(20);
        cp.add(30);
        cp.add(40);
        System.out.println("CopyOnWriteArrayList: " + cp);

        // Create an iterator for CopyOnWriteArrayList
        Iterator<Integer> it = cp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            cp.add(200); // Modify the CopyOnWriteArrayList while iterating
        }

        /*
         * Explanation:
         * 
         * ArrayList uses a fail-fast iterator, which throws a
         * ConcurrentModificationException
         * if the underlying collection is modified while iterating over it.
         * 
         * CopyOnWriteArrayList, on the other hand, uses a fail-safe iterator. This
         * means that
         * it allows modifications to the underlying collection while iterating over it,
         * without
         * throwing any exception.
         * 
         * In this code, we demonstrate the behavior of a fail-safe iterator with
         * CopyOnWriteArrayList.
         * We create an iterator 'it' for the CopyOnWriteArrayList 'cp'. Then, we
         * iterate over 'cp'
         * using the iterator. Inside the loop, we print each element and add a new
         * element to 'cp'.
         * 
         * Despite modifying 'cp' while iterating over it, no
         * ConcurrentModificationException is thrown.
         * This is because CopyOnWriteArrayList creates a copy of the underlying array
         * each time it
         * is modified, ensuring that the original collection remains unchanged during
         * iteration.
         * 
         * This behavior makes CopyOnWriteArrayList suitable for situations where
         * concurrent access
         * to a collection is required without the risk of data corruption or exceptions
         * due to
         * modifications during iteration.
         */
    }
}
