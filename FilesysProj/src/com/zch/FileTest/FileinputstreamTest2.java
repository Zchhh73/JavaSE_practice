package com.zch.FileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputstreamTest2 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file/io/text.txt");
            byte[] b = new byte[100];
            fis.read(b,0,7);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
