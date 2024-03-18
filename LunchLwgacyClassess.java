import java.util.Enumeration;
import java.util.Vector;

public class LunchLwgacyClassess {
    
    public static void main(String[] args) {
        
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println(v);
        Enumeration E=v.elements();

        while (E.hasMoreElements()) {

            System.out.println(E.nextElement());
            
        }



    }
}
