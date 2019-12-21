import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File dir = new File("myfolder");
//        File dir = new File("C:\\Users\\Abdur_Razzak\\Documents\\codes\\hello-project\\myDir");
//        File dir2 = new File("C:/Users/Abdur_Razzak/Documents/codes/hello-project/MyTestFolder");
//        dir2.mkdir();

        dir.mkdir();
        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        System.out.println(dir.getName());
        if (dir.delete()) {
            System.out.printf("%s has been deleted%n", dir.getName());
        }



    }
}
