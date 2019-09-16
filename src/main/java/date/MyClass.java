package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyClass {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);


        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);

        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println("Before formatting: " + myObj3);

//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        String formatedDate = myObj3.format(formatObj);
        System.out.println("After formatting: " + formatedDate);

    }
}
