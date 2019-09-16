package javaenum;

public class MyClass {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
//        System.out.println(myVar);

        switch (myVar){
            case LOW:
                System.out.println("Low Level");
                break;

            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        for (Level myVar2 : Level.values()){
            System.out.println(myVar2);
        }
    }

}
