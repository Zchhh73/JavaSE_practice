package com.zch.FileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class imageTest {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file/zch/bg.jpg");
            FileOutputStream fos = new FileOutputStream("file/zch/backg.jpg");

            int n = 0;
            byte[] b = new byte[1024];
            while((n=fis.read(b)) != -1){
                fos.write(b,0,n);
            }
            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
