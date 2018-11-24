package com.myjava01;
/*
    多态的前提：
        子父类的继承关系
        方法的重写；
        !父类引用指向子类对象:
            Animal a = new Cat();

    动态绑定：
        运行期间调用的方法，是根据其具体的类型

    编译期间：

 */
public class PoymorphicDemo {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.eat();
        Animal a = new Cat();
        a.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}

class Cat extends Animal {
    public void eat(){
        System.out.println("猫吃鱼");
    }
}