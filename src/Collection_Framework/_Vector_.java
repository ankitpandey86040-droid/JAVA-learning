package Collection_Framework;
import java.util.Vector;


public class _Vector_ {

    public static void main(String[] args){
     Vector <Integer> v = new Vector<>(3);    // Initial Capacity = 3

     v.add(5);
     v.add(9);
     v.add(55);
     v.add(44); // vector now increases to 2x , capacity now = 6

      System.out.println("Elements are :"+v);
    }
}
