import java.util.HashMap;
import java.util.LinkedHashMap;

public class Explanation {
    
    public static void main(String[] args) {
        
        HashMap hm=new HashMap();
        hm.put(01,"Vinay Kumar" );
        hm.put(01, "Shahu");
        hm.put(03, "Babby");
        hm.put(04, "Banti");

        System.out.println(hm);

        System.out.println("--------------------------");

        // Note: We can put String also as a key
        HashMap hm1=new HashMap();
        hm1.put(01,"Vinay Kumar" );
        hm1.put(01, "Shahu");
        hm1.put(03, "Babby");
        hm1.put(04, "Banti");

        System.out.println(hm1);

        System.out.println("--------------------------");


        // This will give the output in a ordered way in the same given order.

        LinkedHashMap lhm=new LinkedHashMap();

        lhm.put(01,"Vinay");
        lhm.put(52,"Shubhanshu");
        lhm.put(07, "Arjun Sahani");

        System.out.println(lhm);



    }
}
