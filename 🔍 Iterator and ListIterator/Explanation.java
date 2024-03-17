import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Explanation {

    public static void main(String[] args) {

        // Used for fetching the data and Doing the operation
        // here index-based access is not allowed.
        // For accessing the data, we can use iterator and list iterator both.

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);

        System.out.println(al);

        // For loop
        // for (int i = 0; i < al.size(); i++) {
        // Object o = al.get(i);
        // System.out.println(o);
        // }

        // // for each loop
        // for (Object o : al) {
        // System.out.println(o);
        // }

        // But when we will access traversal and we want to access the data then it will
        // not be stopped it will run infinite time that's why index-based access don't
        // allow.

        // the best approach is to access the element is iterator.

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ListIterator litr = al.listIterator(al.size());

        while (litr.hasPrevious()) {

            System.out.println(litr.previous());
            
        }

    }
}
