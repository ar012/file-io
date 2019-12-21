package exceptionHandling;

import java.util.Scanner;

public class MakeException2 {

    public static void main(String[] args) {

        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        try {
            number = sc.nextInt();
            if (number > 10){
                throw new MyException();
            }
        } catch (MyException e){

        }
        catch (Exception e){
            System.out.println("Number can't be greater than 10");
        }
        System.out.println("Program ends");
    }
}

class MyException extends Exception{
    public MyException(){
        System.out.println("Number can't be greater than 10 (Constructor)");
    }
}
