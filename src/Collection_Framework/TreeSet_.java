package Collection_Framework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        // Add
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(20);   // Duplicate

        System.out.println("TreeSet : " + set);

        // Search
        System.out.println("Contains 20 : " + set.contains(20));

        // Remove
        set.remove(20);
        System.out.println("After Remove : " + set);

        // Size
        System.out.println("Size : " + set.size());

        // Empty
        System.out.println("Is Empty : " + set.isEmpty());

        // Clear
        set.clear();
        System.out.println("After Clear : " + set);
    }
}