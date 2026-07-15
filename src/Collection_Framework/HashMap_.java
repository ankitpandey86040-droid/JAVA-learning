package Collection_Framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_ {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        // Add
        map.put(101, "Rahul");
        map.put(102, "Aman");
        map.put(103, "Rohit");

        System.out.println("LinkedHashMap : " + map);

        // Get
        System.out.println("Key 102 : " + map.get(102));

        // Search Key
        System.out.println("Contains Key 101 : " + map.containsKey(101));

        // Search Value
        System.out.println("Contains Value Aman : " + map.containsValue("Aman"));

        // Replace
        map.replace(102, "Ankit");
        System.out.println("After Replace : " + map);

        // putIfAbsent
        map.putIfAbsent(102, "Sumit");   // Not Added
        map.putIfAbsent(104, "Sumit");   // Added

        System.out.println("After putIfAbsent : " + map);

        // getOrDefault
        System.out.println(map.getOrDefault(105, "Not Found"));

        // Remove
        map.remove(103);

        System.out.println("After Remove : " + map);

        // Size
        System.out.println("Size : " + map.size());

        // Keys
        System.out.println("Keys : " + map.keySet());

        // Values
        System.out.println("Values : " + map.values());

        // Entries
        System.out.println("Entries : " + map.entrySet());

        // Traversing
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Clear
        map.clear();

        System.out.println("After Clear : " + map);
    }
}
