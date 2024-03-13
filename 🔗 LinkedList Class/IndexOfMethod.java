import java.util.LinkedList;

public class IndexOfMethod {
    
    public static void main(String[] args) {
        
        LinkedList ll=new LinkedList();
        ll.add(34);
        ll.add(56);
        ll.add(67);

        // indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
        System.out.println("Index of element 56: "+ ll.indexOf(56));

        System.out.println("----------------------");

       
    }
}
