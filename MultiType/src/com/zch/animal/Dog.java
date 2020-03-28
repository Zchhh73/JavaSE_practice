package com.zch.animal;

public class Dog extends Animal {

    private String sex;

    public Dog() {
    }

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉~~");
    }

    public void sleep(){
        System.out.println("小狗午睡");


    }
}
