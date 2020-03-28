package com.zch.test;

public class StringTest1 {
    public static void main(String[] args) {
        String str = "JAVA编程基础,学习java编程";
        System.out.println("字符串长度是："+ str.length());

//        //charAt打印字符。
//        System.out.println(str.charAt(6));
//
//        //求子串
//        System.out.println(str.substring(5));
//        //左闭右开
//        System.out.println(str.substring(5,7));

        //indexOf  LastIndexOf
        System.out.println(str.indexOf('A'));
        //查找子串
        System.out.println(str.indexOf("编程"));

        System.out.println(str.lastIndexOf('A'));

        System.out.println(str.lastIndexOf("编程"));

        //从index 8开始查找子串编程
        System.out.println(str.indexOf("编程",8));
        //替换,判断是否相同，比较字符串
//        str.replace();
//        str.equals();
//        str.compareTo();
    }
}
