package Collection_Framework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_ {

    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(103,"Rohit");
        map.put(101,"Rahul");
        map.put(104,"Ankit");
        map.put(102,"Aman");

        System.out.println(map);

        System.out.println(map.get(101));

        System.out.println(map.containsKey(103));

        System.out.println(map.containsValue("Rahul"));

        System.out.println(map.firstKey());

        System.out.println(map.lastKey());

        System.out.println(map.firstEntry());

        System.out.println(map.lastEntry());

        System.out.println(map.higherKey(102));

        System.out.println(map.lowerKey(103));

        System.out.println(map.ceilingKey(102));

        System.out.println(map.floorKey(103));

        for(Map.Entry<Integer,String> entry : map.entrySet()){

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        map.remove(104);

        System.out.println(map);

        map.clear();

        System.out.println(map);

    }
}