package com.zch.test;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String, String> animal = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        //添加数据
        int i = 0;
        while (i < 3) {
            System.out.println("输入key值：");
            String key = in.next();
            System.out.println("输入value值：");
            String value = in.next();
            animal.put(key, value);
            i++;
        }

        //输出数据m
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("===============================");
        //使用entrySet打印键值对
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey() + "-");
            System.out.println(entry.getValue());
        }

        System.out.println("===============================");
        System.out.println("请输入查找单词：");
        //通过单词找到注释并输出，使用keySet方法
        String strSearch = in.next();
        //取得keySet
        Set<String> keySet = animal.keySet();
        //遍历
        for (String key : keySet) {
            if (strSearch.equals(key)){
                System.out.println("找到了，键值对为："+key+"-"+animal.get(key));
                break;
            }
        }

    }
}
