import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementListAndDequeBoth {
    
    public static void main(String[] args) {
        
       // Creating a LinkedList named ll1
       List ll1 = new LinkedList();

       // Adding elements to ll1
       ll1.add(12);
       ll1.add(34);
       ll1.add(66);

       // Explanation: Let's see what ll1 can do

       /*
        * Explanation: When we use LinkedList, it can do everything a List and a Deque can do.
        * So, when we use LinkedList, we can use methods from both List and Deque.
        */

        // get(): Retrieve an element from ll1
        ll1.get(3);
       System.out.println(ll1);

       // IndesOf(): Find the index of an element in ll1
       System.out.println(ll1.indexOf(66));

       //LastIndexOf(): Find the last index of an element in ll1
       System.out.println(ll1.lastIndexOf(66));


       // Creating a new LinkedList named l
       LinkedList l=new LinkedList();
       l.add(210);
       l.add(23);
       l.add(90);
       l.add(555);

       // getFirst(): Retrieve the first element from l
       System.out.println(l.getFirst());

       // getLast(): Retrieve the last element from l
       System.out.println(l.getLast());

       //push(): Add an element to the beginning of l
       l.push(52);
       System.out.println(l);

       // pop(): Remove and retrieve the first element from l
       l.pop();
       System.out.println(l);
       
       // Deque ll = new LinkedList();

        /*
        * Explanation: When we use Deque, it means we want to use a double-ended queue.
        * LinkedList can be used as a double-ended queue, so when we declare it as a Deque,
        * we can use methods from the Deque interface.
        */
    }
}
