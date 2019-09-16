package stream;

import java.io.IOException;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("Hello ... \n");
        System.err.println("Error...");

        try{
            System.out.println("Enter the Value = ");
            // returns ASCII code of 1st character
            int inValue = System.in.read();
            System.out.println("inValue = " + inValue);
            System.out.println((char) inValue);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
