import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File dir = new File("Subject");
        dir.mkdir();
        String dirLocation = dir.getAbsolutePath();

        File file1 = new File(dirLocation + "/mathematics.txt");
        File file2 = new File(dirLocation + "/Physics.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(file1.exists()){
            System.out.println(file1.getName()+" file exists");
        } else {
            System.out.println(file1.getName()+" file does not exist");
        }

        file2.delete();
        if(file2.exists()){
            System.out.println(file2.getName()+" file exists");
        } else {
            System.out.println(file2.getName()+" file does not exist");
        }


    }
}
