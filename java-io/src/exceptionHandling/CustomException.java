package exceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        try {
            if (x > 10){
                throw new MyException1("number can't be greater than 10");
//                throw new Exception("number can't be greater than 10");
            }
        } catch (MyException1 e){
            e.printStackTrace();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}


class MyException1 extends Exception{

    public MyException1(String msg){
        super(msg);
    }

}