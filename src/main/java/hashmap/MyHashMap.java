package hashmap;

import java.util.HashMap;

public class MyHashMap {

    public static void main(String[] args) {
        HashMap<String, String> capitalcities = new HashMap<String, String>();
        capitalcities.put("England", "London");
        capitalcities.put("Germay", "Berlin");
        capitalcities.put("USA", "Washington Dc");

        System.out.println(capitalcities);

//        String city = capitalcities.get("Germay");

//        System.out.println(city);
//        capitalcities.remove("USA");
//        System.out.println(capitalcities);

//        capitalcities.clear();
//        System.out.println(capitalcities);

//        System.out.println(capitalcities.size());

        for (String i : capitalcities.keySet()){
            System.out.println(i);
        }

        for (String i : capitalcities.values()){
            System.out.println(i);
        }

        for (String i : capitalcities.keySet()){
            System.out.println("Key: " + i + " Value: " + capitalcities.get(i));
        }
    }
}
