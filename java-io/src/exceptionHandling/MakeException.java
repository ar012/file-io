package exceptionHandling;

import java.util.Scanner;

public class MakeException {

    public static void main(String[] args) {

        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        try {
            number = sc.nextInt();
            if (number > 10){
                Exception e = new Exception();
                throw e;
            }
        } catch (Exception e){
            System.out.println("Number can't be greater than 10");
        }
        System.out.println("Program ends");
    }
}
