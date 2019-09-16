package selfpack;

import java.io.IOException;

public class MyPackClass {

    public static void main(String[] args) throws IOException {
        System.out.println("This is my package.");

        int i=System.in.read();//returns ASCII code of 1st character
        System.out.println((char)i);//will print the character
    }
}
