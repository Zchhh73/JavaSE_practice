package com.zch.Test;

import com.zch.animal.Animal;
import com.zch.animal.Cat;
import com.zch.animal.Dog;

public class Test {

    public static void main(String[] args) {
        Animal one = new Animal();//1
        //向上转型、隐式转型：父类引用指向子类实例。
        Animal two = new Cat();//2
        Animal three = new Dog();//3

        one.eat();
        two.eat();
        three.eat();
        System.out.println();

        //向下转型，强制类型转换
        Cat temp = (Cat) two;
        temp.eat();
        temp.run();

        if(two instanceof Cat){
            System.out.println("Cat true");
        }
        if(two instanceof Animal){
            System.out.println("Animal true");
        }
        if(two instanceof Object){
            System.out.println("Object true");
        }

    }
}
