package modifiers;

public class MyClass {


   final int x = 10;
   final double PI = 3.14159;

   static void myStatidMethod(){
       System.out.println("Static method can be called without creating objects");
   }

   public void myPublicMethod(){
       System.out.println("Public method must be called by creating objects");
   }


    public static void main(String[] args) {
        MyClass myObj = new MyClass();
//        myObj.x = 50;
//        myObj.PI = 25;
        System.out.println(myObj.x);
        System.out.println(myObj.PI);



        myStatidMethod();

        myObj.myPublicMethod();

        Student myStudent = new Student();

        System.out.println(myStudent.fname);
        System.out.println(myStudent.age);
        System.out.println(myStudent.gYear);

        myStudent.study();





    }
}
