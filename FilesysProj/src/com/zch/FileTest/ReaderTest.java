package com.zch.FileTest;

import java.io.*;

public class ReaderTest {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file/io/text.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            //输入流对象
            BufferedReader br = new BufferedReader(isr);
            FileOutputStream fos = new FileOutputStream("file/io/text1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);


            int n = 0;
            char[] cbuf = new char[10];
//            输出字节流
//            while((n = isr.read())!= -1){
//                System.out.print((char)n);
//            }
            //输出字符流
//            while((n = isr.read(cbuf))!= -1){
//                String s = new String(cbuf,0,n);
//                System.out.print(s);
//            }

            while((n = br.read(cbuf))!= -1){
                bw.write(cbuf,0,n);
            }
            bw.flush();
            fis.close();
            isr.close();
            fos.close();
            osw.close();
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
