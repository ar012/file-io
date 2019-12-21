import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadWithScanner {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("Subject/mathematics.txt");
        Scanner scanner = new Scanner(file);
//        String s1 = scanner.nextLine();
//        System.out.println(s1);
//        String s2 = scanner.nextLine();
//        System.out.println(s2);

//        int s1 = scanner.nextInt();
//        System.out.println(s1);
//        String s2 = scanner.next();
//        System.out.println(s2);
//
//        float s3 = scanner.nextFloat();
//        System.out.println(s3);


        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
