import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class Explanation {
    public static void main(String[] args) {
        // Create a new ArrayList named 'ar'
        ArrayList ar = new ArrayList();

        // Add elements to the ArrayList
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        ar.add(100);

        // Print the ArrayList to the console
        System.out.println(ar);

        // Iterate over the ArrayList using a for loop
        // for (int i = 0; i < ar.size(); i++) {
        //     // Print the element at index 'i'
        //     System.out.println(ar.get(i));

        //     // Add the value 100 to the ArrayList
        //     ar.add(100);

            /*
             * Here, we can't use a simple for loop concept to iterate over the ArrayList
             * because adding an element inside the loop will result in an infinite loop.
             * This is because the loop condition is based on the initial size of the
             * ArrayList,
             * and it doesn't update as new elements are added.
             * 
             * The loop goes on forever because it's set up to stop when it reaches a
             * certain point, based on how many items are in the list when it starts. But as
             * we keep adding more items to the list while the loop runs, the loop doesn't
             * know to stop because it doesn't check for the new items. To prevent this,
             * it's better to use a different method, like iterators, when we want to both
             * go through a list and change it at the same time.
             */

            //  Iterator itr=ar.iterator();
            //  while (itr.hasNext()) {

            //     System.out.println(itr.next());
            //     ar.add(100);
                // FailFast: The Iterator throws a ConcurrentModificationException 
                // if the ArrayList is modified while iterating over it.
                // This is because the Iterator is fail-fast, meaning it immediately 
                // throws an exception if the ArrayList is modified while it's being 
                // iterated over.
                // This is a safety feature to prevent the ArrayList from being
                // corrupted by changes made while it's being iterated over.
                // To avoid this, we can use the ListIterator, which allows us to
                // modify the ArrayList while iterating over it.
                


                

             
        

             }

        }
    

