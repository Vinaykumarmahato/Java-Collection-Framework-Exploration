import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {

    
    public static void main(String[] args) {
        // Fail-Fast Example
        List<Integer> failFastList = new ArrayList<>();
        failFastList.add(10);
        failFastList.add(20);
        failFastList.add(30);

        System.out.println("Fail-Fast Example:");

        // Create an iterator for the fail-fast list
        Iterator<Integer> it = failFastList.iterator();

        // Iterate over the fail-fast list
        while (it.hasNext()) {
            // Get the next element
            Integer element = it.next();
            // Print the element
            System.out.println(element);
            // Attempting to modify the list while iterating triggers ConcurrentModificationException
            failFastList.add(200); // Correcting the modification by adding to the collection directly
        }

        System.out.println("\nFail-Safe Example:");

        // Fail-Safe Example
        // Create a fail-safe list using CopyOnWriteArrayList
        CopyOnWriteArrayList cp = new CopyOnWriteArrayList<>();
        cp.add(10);
        cp.add(20);
        cp.add(30);

        System.out.println(cp);

        // Create an iterator for the fail-safe list
        Iterator<Integer> it2 = cp.iterator();

        // Iterate over the fail-safe list
        while (it2.hasNext()) {
            // Get the next element
            Integer element = it2.next();
            // Print the element
            System.out.println(element);
            // Modifying the list while iterating does not throw ConcurrentModificationException
            cp.add(2000);
        }
    }
}
