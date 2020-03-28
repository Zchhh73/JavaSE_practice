package com.zch.test;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("你好");
        str.append(",zchhh");
        System.out.println(str);

        //变大写方法，1.删除在插入大写
        System.out.println(str.delete(3,8).insert(3,"ZCHHH"));
        //replace替换
        System.out.println(str.replace(3,8,"WSPPP"));
        System.out.println(str.substring(0,2));
    }
}
