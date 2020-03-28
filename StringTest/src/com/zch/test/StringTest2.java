package com.zch.test;

import java.io.UnsupportedEncodingException;

public class StringTest2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符串与字符数组
        String str = new String("JAVA 编程 基础");
        //转换 utf-8 一个汉字由3个字节表示
        byte[] arrs = str.getBytes("GBK");
        for(int i = 0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }
        System.out.println();
        //将数组转换为字符串
        String str1 = new String(arrs,"GBK");
        System.out.println(str1);
    }
}
