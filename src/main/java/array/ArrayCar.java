package array;

public class ArrayCar {

    public static void main(String[] args) {
        String[] cars = {"volvo", "toyota", "bmw"};

//        System.out.println(cars[0]);

        int[] myNum = {1,2,3,4};
//        System.out.println(myNum[2]);
        System.out.println("Length: " + myNum.length);

        myNum[3] = 20;
        System.out.println("Length: " + myNum.length);
//        System.out.println(myNum[2]);
//        System.out.println(myNum.length);

        for (int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        for (int i : myNum){
            System.out.println(i);
        }
    }
}
