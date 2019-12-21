package exceptionHandling;

import java.util.Scanner;

public class MyRuntimeException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int x;
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        if (x > 10){
            throw new MyException2();
        }
    }
}

class MyException2 extends RuntimeException {

}
