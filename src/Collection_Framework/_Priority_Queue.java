package Collection_Framework;
import java.util.PriorityQueue;

public class _Priority_Queue {
    public static void main (String [] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //ADD ELEMENTS
        pq.offer(40);
        pq.offer(25);
        pq.offer(155);
        pq.offer(62);

        System.out.println(" PriorityQueue: "+pq);

        //First Element

        System.out.println("peek  :"+pq.peek());

        //Remove  Element
        System.out.println("Poll :"+pq.poll());

       //search Element
        System.out.println("Contains 62 :"+pq.contains(62));

        //size
        System.out.println("size : "+pq.size());

        //Empty
        System.out.println("Is Empty :"+pq.isEmpty());

        //clear
        pq.clear();
        System.out.println("After clear :"+pq);


    }
}
