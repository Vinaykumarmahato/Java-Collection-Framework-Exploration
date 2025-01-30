import java.util.*;
import java.util.Map.Entry;

public class Solution1 {

    public static void main(String[] args) {

        // Create a HashMap instance called 'map'
        Map map = new HashMap();
        // Print a separator line
        System.out.println("----------------------------------");

        // Populate the map with key-value pairs
        map.put(01, "Rohan");
        map.put(02, "Rohit");
        map.put(03, "Rahul");
        map.put(04, "Ramesh");

        // Print the value associated with key 04
        System.out.println(map.get(04));

        // Print a separator line
        System.out.println("----------------------------------");

        // Access only keys from the map
        Set key = map.keySet();

        // Iterator to traverse through the keys
        Iterator itr1 = key.iterator();

        // Print keys
        while (itr1.hasNext()) {
            Integer key1 = (Integer) itr1.next(); // Downcasting to Integer type
            // Now key1 can be used to access keys anywhere
            System.out.println(key1);
        }

        // Print a separator line
        System.out.println("-----------------------");

        // Access only values from the map
        Collection onlyValue = map.values();

        // Iterator to traverse through the values
        Iterator itr2 = onlyValue.iterator();

        // Print values
        while (itr2.hasNext()) {
            String key2 = (String) itr2.next();
            System.out.println(key2);
        }

        // Print a separator line
        System.out.println("----------------------------------");

        // Access both keys and values from the map
        Set allValues = map.entrySet();

        // Iterator to traverse through key-value pairs
        Iterator itr3 = allValues.iterator();

        // Print keys and values
        while (itr3.hasNext()) {
            // Access both String and Integer values using Map.Entry
            Map.Entry key3 = (Entry) itr3.next();
            System.out.println(key3.getKey() + ":" + key3.getValue());
        }

        // Print a separator line
        System.out.println("----------------------------------");

    }
}
