package exceptionHandling;

public class CreateException {
    public static void main(String[] args) {

        A obj = new A();

        try {
            obj.print1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        obj.print2();

    }
}

class A {
    public void print1() throws Exception {

    }

    public void print2() throws RuntimeException{

    }
}
