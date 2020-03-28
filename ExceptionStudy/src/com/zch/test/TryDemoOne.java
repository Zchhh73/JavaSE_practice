package com.zch.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

    public static void main(String[] args) {
        //定义两个整数，接收用户键盘输入，输出商
        Scanner in = new Scanner(System.in);
        System.out.println("======运算开始======");
        try{
        System.out.println("输入第一个整数");
        int one = in.nextInt();
        System.out.println("输入第二个整数");
        int two = in.nextInt();
        System.out.println("商为："+(one/two));
        }catch(ArithmeticException e){
            System.out.println("除数不允许为0。");
//            System.exit(1);//终止程序运行，终止finally执行
            e.printStackTrace();
        }catch(InputMismatchException e){
            System.out.println("输入整数。");
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("程序出错了。");
            e.printStackTrace();
        }finally {
            System.out.println("======运算结束======");
        }
    }


}
