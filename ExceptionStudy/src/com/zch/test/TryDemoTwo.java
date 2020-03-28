package com.zch.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoTwo {

    public static void main(String[] args) {
        //定义两个整数，接收用户键盘输入，输出商
        try {
            int result = test();
            System.out.println("商为：" + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为0.");
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println("输入整数。");
            e.printStackTrace();
        }
    }

    /**
     *
     * @return
     * @throws ArithmeticException 除数为0异常
     * @throws InputMismatchException 输入不匹配异常
     */
    public static int test() throws ArithmeticException,InputMismatchException {
        Scanner in = new Scanner(System.in);
        System.out.println("======运算开始======");
        System.out.println("输入第一个整数");
        int one = in.nextInt();
        System.out.println("输入第二个整数");
        int two = in.nextInt();
        System.out.println("======运算结束======");
        return one / two;
    }


}
