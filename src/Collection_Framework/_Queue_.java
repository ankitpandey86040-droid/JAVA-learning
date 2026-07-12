package Collection_Framework;
import java.util.LinkedList;
import java.util.Queue;

public class _Queue_ {

    public static void main(String [] args){
        // create queue
        Queue<Integer> q = new LinkedList<>();

        //Add elements
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(140);
        q.offer(50);

        System.out.println("Queue : "+q);

        // first element
        System.out.println("Peek :"+q.peek());

        // remove first element
        System.out.println("Poll :"+q.poll());

        System.out.println("After Poll :"+q);

        //search elements

        System.out.println("contains 20 :"+q.contains(20));

        //size
        System.out.println("Size :"+q.size());

        //empty or not
        System.out.println("Is Empty :"+q.isEmpty());

        // remove all elements
        q.clear();
        System.out.println("After clear :"+q);

    }
}
