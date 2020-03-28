package com.zch.test;

public class StringTest3 {

    //==与equal关系
    public static void main(String[] args) {
        String str1 = "zchhh";
        String str2 = "zchhh";
        String str3 = new String("zchhh");
        System.out.println("内容相同?"+(str1.equals(str2)));
        System.out.println("内容相同?"+(str1.equals(str3)));

        System.out.println("地址相同?"+(str1==str2));
        System.out.println("地址相同?"+(str1==str3));


    }
}
