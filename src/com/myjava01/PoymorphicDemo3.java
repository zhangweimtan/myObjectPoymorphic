package com.myjava01;
/*
    多台中的向上转型和向下转型
    引用类型之间的转换
        向上转型：
            由小转大，小--子类，大--父类
        向下转型：
            由大转小
    基本数据类型转换
        自动类型转换：由小转大 byte int char--int ---long---float--double
        强制类型转换：由大转小，可能损失精度
 */
public class PoymorphicDemo3 {
    public static void main(String[] args) {
        Animal2 a = new Dog2();//类型转换，向上，子到父,父类指向子类
        a.eat();//执行子类方法
        ((Dog2) a).swim();//(dog2)强制转换，子类指向父类，向下转型
        Dog2 d = (Dog2)a;
        d.swim();
    }
}

class Animal2 {
    public void eat(){
        System.out.println("吃东西");
    }
}

class Dog2 extends Animal2 {
    public void eat() {
        System.out.println("啃骨头");
    }
    public void swim() {
        System.out.println("狗刨");
    }
}