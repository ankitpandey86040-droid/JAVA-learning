package Collection_Framework;
import java.util.Hashtable;
import java.util.Map;

public class Hashtable_ {

    public static void main(String[] args) {

        Hashtable<Integer,String> map = new Hashtable<>();

        map.put(101,"Rahul");
        map.put(102,"Aman");
        map.put(103,"Rohit");

        System.out.println(map);

        System.out.println(map.get(101));

        System.out.println(map.containsKey(102));

        System.out.println(map.containsValue("Rahul"));

        map.replace(103,"Mohit");

        map.putIfAbsent(104,"Ankit");

        System.out.println(map.getOrDefault(105,"Not Found"));

        for(Map.Entry<Integer,String> entry : map.entrySet()){

            System.out.println(entry.getKey()+" -> "+entry.getValue());

        }

        map.remove(102);

        System.out.println(map);

        map.clear();

        System.out.println(map);
    }
}
