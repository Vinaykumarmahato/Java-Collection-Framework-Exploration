import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementListAndDequeBoth {
    
    public static void main(String[] args) {
        
       List ll1 = new LinkedList();
       ll1.add(12);
       ll1.add(34);
       ll1.add(66);

       // Lets See

       

       /*
        * When we declare the variable as LinkedList, it will implement both List and Deque interfaces.
        * LinkedList class in Java implements both List and Deque interfaces.
        * Therefore, by declaring the variable as LinkedList, we can utilize methods from both interfaces.
        */

        // Lets see some Method in List:

        // get()
        ll1.get(3);
       System.out.println(ll1);

       // IndesOf()
       System.out.println(ll1.indexOf(66));

       //LastIndexOf()
       System.out.println(ll1.lastIndexOf(66));


       LinkedList l=new LinkedList();
       l.add(210);
       l.add(23);
       l.add(90);
       l.add(555);

       // getFirst()
       System.out.println(l.getFirst());

       // getLast()
       System.out.println(l.getLast());

       //push()

       l.push(52);
       System.out.println(l);

       // pop()
       l.pop();
       System.out.println(l);
       








        Deque ll = new LinkedList();


        /*
        * When we declare the variable as Deque, it will implement the Deque interface.
        * LinkedList class in Java implements the Deque interface.
        * Therefore, by declaring the variable as Deque and initializing it with a LinkedList object,
        * we can utilize methods from the Deque interface.
        */
    }
}
