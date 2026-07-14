package Collection_Framework;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;


class Main {
public static void main(){
    //MINHEAP
    PriorityQueue <Integer> minpq = new PriorityQueue<>();
    minpq.offer(10);
    minpq.offer(20);
    minpq.offer(30);
    minpq.offer(40);
    System.out.println("min heap :"+minpq);
    System.out.println("poll :"+minpq.poll());

    //MAXHEAP

    PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
    maxpq.offer(30);
    maxpq.offer(20);
    maxpq.offer(10);
    maxpq.offer(40);
    System.out.println("MAX HEAP : "+ maxpq);
    System.out.println("Poll : "+maxpq.poll());


}

}
