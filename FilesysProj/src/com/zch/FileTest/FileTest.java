package com.zch.FileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args){
//        File file = new File("file/io/text.txt");
        File file = new File("file/io","text.txt");
        System.out.println("文件："+file.isFile());
        System.out.println("目录："+file.isDirectory());

        //创建目录
        File file2 = new File("file/io/set/HashSet","");
        if(!file2.exists()){
            file2.mkdirs();
        }

        //创建文件
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
