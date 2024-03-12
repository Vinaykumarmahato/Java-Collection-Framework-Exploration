import java.util.ArrayList;

public class ArrayListSolution3 {

    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);

        System.out.println(al1);

        System.out.println("----------------------");

        al1.add(0, "Vinay Kumar");
        System.out.println(al1);

        System.out.println("-----------------------");

        // contains()

        al1.contains(300);
        System.out.println(al1);// true

        System.out.println("-----------------------");

        int index = al1.indexOf(400);
        System.out.println(index);

        System.out.println("---------------------------");

        al1.size();
        System.out.println(al1);
        System.out.println("--------------------------");

        al1.ensureCapacity(10);
        System.out.println("Here the Default capacity that i have given 10 but in used there are few index not 100");

        System.out.println("--------------------------");

        al1.trimToSize();
        System.out.println("here the ensure size has remove by using trimToSize KeyWords");
        System.out.println("---------------------------------");
        // here the ensure size has remove by using trimToSize KeyWords

        

    }
}
