package method;

public class MyClass {

    static void myMethod(String fname) {
        System.out.println("Welcome " + fname);

    }

    static int myMethod2(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
//        myMethod("Jamil");

        int z = myMethod2(3, 5);
        System.out.println(z);
    }
}
