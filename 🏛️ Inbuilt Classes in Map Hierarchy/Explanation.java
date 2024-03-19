import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Explanation {
    
    public static void main(String[] args) {
        
        Hashtable hm=new Hashtable();
        hm.put(01, "Vinay Kumar");
        hm.put(02, "LawKush");
        hm.put(03, "Rohiy");
        hm.put(04, "Saravan");

        System.out.println(hm);
        System.out.println("----------------------");

        hm.putIfAbsent(05, "Ramu");
        System.out.println(hm);

        System.out.println("----------------------");

        TreeMap tm=new TreeMap();
        tm.put(02, "Rohini");
        tm.put(03, "Shwetha");
        tm.put(04, "Rajani");

        System.out.println(tm);

    }
}
