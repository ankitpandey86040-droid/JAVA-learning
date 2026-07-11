package Collection_Framework;
import java.util.LinkedList;

public class java_linkedlist {
    public static void main( String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        System.out.println(list.getFirst());
    }

}
