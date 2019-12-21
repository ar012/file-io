package problemSolving;

import java.util.Scanner;

public class ExceptionProblem {

    public static void main(String[] args) {
//        while (true){
//            try {
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Please enter num1: ");
//                int num1 = scanner.nextInt();
//                System.out.print("Please enter num2: ");
//                int num2 = scanner.nextInt();
//                int result =num1 / num2;
//                System.out.println("Result: " + num1 + " / "+ num2 + " = " + result);
//                System.out.println();
//            } catch (Exception e){
//                System.out.println("Exception: " + e);
//                System.out.println("You must enter integer. Please try again");
//                System.out.println();
//            }
//        }

        int count = 1;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter num1: ");
                int num1 = scanner.nextInt();
                System.out.print("Please enter num2: ");
                int num2 = scanner.nextInt();
                int result =num1 / num2;
                System.out.println("Result: " + num1 + " / "+ num2 + " = " + result);
                System.out.println();
                count = 2;
            } catch (Exception e){
                System.out.println("Exception: " + e);
                System.out.println("You must enter integer. Please try again");
                System.out.println();
            }
        } while (count == 1);
    }
}
