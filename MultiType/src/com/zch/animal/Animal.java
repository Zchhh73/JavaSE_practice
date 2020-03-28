package com.zch.animal;

public class Animal {
    private String name;
    private int month;


    public Animal(){}

    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //吃东西
    public void eat(){
        System.out.println("动物都吃东西。");
    }

}
