package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Add Elements
        dq.addFirst(20);
        dq.addFirst(10);
        dq.addLast(30);
        dq.addLast(40);

        System.out.println("Deque : " + dq);

        // View Elements
        System.out.println("First : " + dq.getFirst());
        System.out.println("Last : " + dq.getLast());

        // Remove Elements
        System.out.println("Remove First : " + dq.removeFirst());
        System.out.println("Remove Last : " + dq.removeLast());

        System.out.println("After Remove : " + dq);

        // Search
        System.out.println("Contains 20 : " + dq.contains(20));

        // Size
        System.out.println("Size : " + dq.size());

        // Empty
        System.out.println("Is Empty : " + dq.isEmpty());

        // Clear
        dq.clear();

        System.out.println("After Clear : " + dq);
    }
}
