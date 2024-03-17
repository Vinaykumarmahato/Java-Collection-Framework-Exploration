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

// Unordered Collection: HashSet does not maintain any order of elements.
// Unique Elements: HashSet does not allow duplicate elements.
// Performance: Offers constant-time performance for basic operations (add,
// remove, contains) assuming a good hash function.
// Backed by HashMap: Internally uses a HashMap to store elements.
// Iteration Order: The iteration order of a HashSet is unpredictable and may
// change over time due to resizing and rehashing operations.
// Introduced in Java Version: HashSet was introduced in Java 1.2.
// LinkedHashSet:

// Maintains Insertion Order: LinkedHashSet maintains the insertion order of
// elements, i.e., the order in which elements were inserted into the set.
// Unique Elements: Like HashSet, LinkedHashSet also does not allow duplicate
// elements.
// Performance: Offers constant-time performance for basic operations (add,
// remove, contains) assuming a good hash function.
// Backed by LinkedHashMap: Internally uses a LinkedHashMap to store elements,
// maintaining a doubly linked list to maintain insertion order.
// Iteration Order: The iteration order of a LinkedHashSet is the order in which
// elements were inserted into the set.
// Introduced in Java Version: LinkedHashSet was introduced in Java 1.4.