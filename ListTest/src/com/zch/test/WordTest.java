package com.zch.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordTest {
    //将单词添加到hashset中
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");

        //迭代器取元素
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
