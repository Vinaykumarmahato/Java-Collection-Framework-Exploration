import java.util.HashSet;

public class ExplanationOFBothLinkedHsahSetAndHashSet {

    public static void main(String[] args) {
        
        // HashSet: it will not preserve the order of insertion
        // Introduced in Java 1.2

        HashSet hs1 = new HashSet();
        hs1.add(200);
        hs1.add(300);
        hs1.add(130);
        hs1.add(90);

        System.out.println(hs1); // Output may vary, not necessarily in insertion order.

        // LinkedHashSet: It will preserve the order of insertion.
        // Introduced in Java 1.4

        HashSet hs2 = new HashSet();
        hs2.add(200);
        hs2.add(300);
        hs2.add(130);
        hs2.add(90);

        System.out.println(hs2); // Output may vary, not necessarily in insertion order.

    }
}
