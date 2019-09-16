package hashmap;

import java.util.HashMap;

public class MyHashMap2 {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Manik", 25);
        people.put("Nasim", 10);
        people.put("Rini", 20);

        System.out.println(people);
    }
}
