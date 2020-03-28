package com.zch.test;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {

    public static void main(String[] args) {
        Notice notice1 = new Notice(1,"Welcome","zch",new Date());
        Notice notice2 = new Notice(2,"HaHa","zch",new Date());
        Notice notice3 = new Notice(3,"Bye","zch",new Date());

        //添加公告
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        //显示公告
        System.out.println("公告内容为：");
        for(int i = 0;i<noticeList.size();i++){
            System.out.println("第"+(i+1)+"条:"+((Notice)(noticeList.get(i))).getTitle());
        }
        notice1.setTitle("111111");
        for(int i = 0;i<noticeList.size();i++){
            System.out.println("第"+(i+1)+"条:"+((Notice)(noticeList.get(i))).getTitle());
        }
    }
}
