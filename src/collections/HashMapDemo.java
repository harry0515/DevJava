package collections;
import java.util.HashMap;
import java.util.*;

public class HashMapDemo {
    public static void main (String args[]){
        HashMap<Integer, String> dict = new HashMap<Integer, String>();
        dict.put(1,"one");
        dict.put(2,"two");
        dict.put(3,"three");
        dict.put(4,"four");
        dict.put(5,"five");
        dict.remove(5, "five");
        dict.put(4,"five");
        String str = dict.toString();
        System.out.println(str);
        for (Map.Entry<Integer, String> entry : dict.entrySet()) {
            int key = entry.getKey();
            String Value = entry.getValue();
        }
        for (int i: dict.keySet()) {
            System.out.println(i);
        }
        for (String j: dict.values()) {
            System.out.println(j);
        }
    }
}


// map interface HashMap LinkedHashMap TreeMap

// HashMap has no order, LinkedHashMap has order of our instancing, TreeMap has order of key.
