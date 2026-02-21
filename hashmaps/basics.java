package hashmaps;
import java.util.*;

public class basics {
    public static void main(String[] args) {
        HashMap<String, Integer> hp = new HashMap<>();

        hp.put("India", 140);
        hp.put("China", 140);
        hp.put("USA", 20);

        System.out.println(hp);

        // size of hashmap
        int result = hp.size();
        System.out.println(result);

        // check if the map is empty or not
        boolean empty = hp.isEmpty();
        System.out.println(empty);

        // alterations in put function
        hp.put("Nigeria", 10); //inserts Nigeria and 10 as a new key and pair
        hp.put("India", 150); //updates value to 150

        // alterations in get function
        hp.get("China"); //returns value of China
        hp.get("France"); //returns null

        // containsKey function
        hp.containsKey("India"); //true
        hp.containsKey("hp"); //false

        // contains value function
        hp.containsValue(150);

        // remove function
        hp.remove("Nigeria");

        // fetching only keys
        Set<String> keys = hp.keySet();
        System.out.println(keys);

        // looping over hashmaps using keys
        for(String key : hp.keySet()){
            int value = hp.get(key);
            System.out.println(value);
        }

        // looping over hashmaps using values
        for(int value : hp.values()){
            System.out.println(value);
        }

        // looping over both key and value
        for(Map.Entry<String, Integer> entry : hp.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
