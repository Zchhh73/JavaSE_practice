package com.zch.test;

import java.util.ArrayList;
import java.util.List;

public class listTest1 {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add("java");
        list.add("C");
        list.add("C++");
        list.add("Go");

        System.out.println(list.size());

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        //移除元素
//        list.remove(2);
        list.remove("C++");
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
