package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DynamicFileCopyConsoleArgs {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter src file:");
        String srcFile = scn.nextLine();

        System.out.print("Enter dest file:");
        String destFile = scn.nextLine();

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int data;
        while ((data = fis.read()) != -1){
            fos.write(data);
        }
        System.out.println("File copied");

        fis.close();
        fos.close();
    }
}
