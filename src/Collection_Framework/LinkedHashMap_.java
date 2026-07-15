package Collection_Framework;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_ {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Rahul");
        map.put(102, "Aman");
        map.put(103, "Rohit");

        System.out.println(map);

        System.out.println(map.get(102));

        System.out.println(map.containsKey(101));

        System.out.println(map.containsValue("Rahul"));

        map.replace(102, "Sumit");

        map.putIfAbsent(104, "Mohit");

        System.out.println(map.getOrDefault(105, "Not Found"));

        map.remove(103);

        for(Map.Entry<Integer,String> entry : map.entrySet()){

            System.out.println(entry.getKey()+" -> "+entry.getValue());

        }

        map.clear();

        System.out.println(map);
    }
}