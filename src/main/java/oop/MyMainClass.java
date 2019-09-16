package oop;

class MyMainClass {

    public static void main(String[] args) {
        Pig myPig = new Pig();

        myPig.animalSound();
        myPig.sleep();


        PigImplement myPig2 = new PigImplement();

        myPig2.animalSound();
        myPig2.sleep();
    }
}
