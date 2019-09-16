package wrapperclass;

public class MyWrapperClass {

    public static void main(String[] args) {
        Integer myInt = 100;
        Double myDouble = 10.5;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println(myInt.byteValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());


        String myString = myInt.toString();
        System.out.println(myString);
        System.out.println(myString.length());
    }
}
