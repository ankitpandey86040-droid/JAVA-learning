package Collection_Framework;
import java.util.Stack;
import java.util.Vector;


public class _Stack_ {
    public static void main (String[] args){
        Stack<Integer> st = new Stack<>();
        //PUSH
        st.push(20);
        st.push(30);
        st.push(100);
        System.out.println("After adding :"+st);

        //POP
        st.pop();
        System.out.println("after pop :"+ st);

        //PEEK
        System.out.println("After peek :"+st.peek());

        //SEARCH
        System.out.println(" search(100) :" +st.search(100));

        //EMPTY
        System.out.println("empty():"+st.empty());
    }
}
