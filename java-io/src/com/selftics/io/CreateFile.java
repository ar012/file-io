package com.selftics.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        File file = new File(("virtual/hello.txt"));
        if (file.exists()){
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist, lets create one");
            try {
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
//    //Find current working directory
//        String workingDir = System.getProperty("user.dir");
//        System.out.println(workingDir);
    }
}
