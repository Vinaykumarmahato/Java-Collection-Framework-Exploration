
import java.util.*;

public class ArrayListSolution5 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        ArrayList al2 = new ArrayList();

        al2.add(20);
        al2.add("Vinay Kumar");
        al2.add('A');
        al2.add(20.22);
        al2.add(3000);

        System.out.println(al2);

        ArrayList al3 = new ArrayList();

        al3.add(1);
        al3.add(2);
        al3.add(4);
        System.out.println("Without adding the al2");
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("After adding al2");
        al3.addAll(al2);

        System.out.println(al3);

    }
}
