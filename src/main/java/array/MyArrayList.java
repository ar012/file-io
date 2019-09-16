package array;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

//        System.out.println(cars);
//
//        System.out.println(cars.get(0));
//
//        cars.set(0, "Opel");
//        System.out.println(cars);
//        cars.remove(2);
//        System.out.println(cars);
//
//        System.out.println(cars.size());
//
//        cars.clear();
//        System.out.println(cars);
//        System.out.println(cars.size());

        for (int i = 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        for (String i : cars){
            System.out.println(i);
        }

        Collections.sort(cars);
        System.out.println(cars);
    }
}
