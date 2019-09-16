package oop;

class Cats {


    public static void main(String[] args) {
        Animal myCat = new Animal() {
            @Override
            public void animalSound() {
                System.out.println("Mue mue");
            }
        };

        myCat.animalSound();

        System.out.println(myCat.food);
    }
}