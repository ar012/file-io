package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("files/abc.txt");
        FileOutputStream fos = new FileOutputStream("files/bbc.txt");

        int data;
        while ((data = fis.read()) != -1){
            fos.write(data);
        }
        System.out.println("File copied");

        fis.close();
        fos.close();
    }
}
