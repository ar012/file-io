package array;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList2 {

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(1);
        myNumbers.add(20);
        myNumbers.add(3);
        myNumbers.add(10);
        myNumbers.add(5);
        myNumbers.add(4);

        System.out.println(myNumbers);

        Collections.sort(myNumbers);

        System.out.println(myNumbers);
    }
}
