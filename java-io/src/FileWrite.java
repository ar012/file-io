import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileWrite {
    public static void main(String[] args) {

        try {
            Formatter formatter = new Formatter("Subject/mathematics.txt");
            formatter.format("%s %s\r\n", "101", "Anis");
            formatter.format("%s %s\r\n", "102", "Rashed");
            formatter.format("%s %s\r\n", "103", "Manik");

            formatter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
