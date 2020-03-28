package com.zch.FileTest;

import java.io.*;

public class GoodsTest {

    public static void main(String[] args) {
        Goods good1 = new Goods("gd001","笔记本",10000);
        try {
            FileOutputStream fos = new FileOutputStream("file/io/text.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("file/io/text.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //对象写入文件
            oos.writeObject(good1);
            oos.writeBoolean(true);
            oos.flush();
            //读
            try {
                Goods goods = (Goods)ois.readObject();
                System.out.println(goods);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(ois.readBoolean());
            fos.close();
            oos.close();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
