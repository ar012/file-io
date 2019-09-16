package oop.innerclass;

public class MyMainClass {
    public static void main(String[] args) {
//
//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//
//        System.out.println(myInner.y + myOuter.x);


//     OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//
//        System.out.println(myInner.y);

        OuterClass myOuter = new OuterClass();

        OuterClass.InnnerClass myInner = myOuter.new InnnerClass();

        System.out.println(myInner.myInnerMethod());

    }
}
