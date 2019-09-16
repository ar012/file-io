import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("files/file-write.txt");
            myWriter.write("Files in Java be tricky but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote the file.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
