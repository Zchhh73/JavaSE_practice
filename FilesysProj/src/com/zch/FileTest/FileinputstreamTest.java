package com.zch.FileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputstreamTest {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file/io/text.txt");
//            int n = fis.read();
//            while(n != -1){
//                System.out.println((char)n);
//                n = fis.read();
//            }
            int n = 0;
            while ((n = fis.read()) != -1) {
                System.out.println((char)n);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
