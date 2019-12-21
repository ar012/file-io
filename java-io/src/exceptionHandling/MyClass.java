package exceptionHandling;

public class MyClass {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 5;
            int result = x/y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
        } catch (Exception e2){
            e2.printStackTrace();
        } finally {
            System.out.println("Last Line of the program");
        }




        try {
            int [] arr = new int[4];
//            arr[4] = 10;
            arr[3] = 10;
            int result = arr[3];
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e2){
            e2.printStackTrace();
        }


        String name = null;
//        System.out.println(name.charAt(0));

        String fName = "Rashed";
//        System.out.println(fName.charAt(6));

//        int num = Integer.parseInt("100a");
//        System.out.println(num);

//        System.out.println("Last Line of the program");


    }
}
