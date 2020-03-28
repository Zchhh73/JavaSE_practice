package com.zch.FileTest;

import java.io.*;

public class BufferTest {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("file/io/text.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            FileInputStream fis = new FileInputStream("file/io/text.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            //写入缓冲区
            long start = System.currentTimeMillis();
            bos.write(50);
            bos.write('a');
            //强制清空，调入flush
            bos.flush();
            System.out.println(bis.read());
            System.out.println((char)bis.read());
            long end = System.currentTimeMillis();
            System.out.println(end-start);
            fos.close();
            bos.close();
            fis.close();
            bis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
