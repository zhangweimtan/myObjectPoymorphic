package com.myjava01;
/*
    多态的成员特点：
        成员变量：编译时看左边，运行时看的左边
        成员方法：编译时看左边，运行看右边
        静态方法：编译时看左边，运行看左边

    总结：
        编译时看左边；
        运行时成员方法看的是右边，其他看的是左边（成员变量，和静态方法）
 */
public class PoymorphicDemo2 {
    public static void main(String[] args) {
        Dad d = new Kids();
        System.out.println(d.num);
//        System.out.println(((Kids) d).num);
        d.method();
        d.function();//使用变量去调用静态方法，其实相当于使用变量类型的类名去调用
    }
}

class Dad{
    int num =20;
    public void method(){
        System.out.println("我是父类方法");
    }
    public static void function(){
        System.out.println("我是父类的静态方法");
    }
}

class Kids extends Dad {
    int num = 10;
    public void method() {
        System.out.println("我是子类方法");
    }
    public static void function(){
        System.out.println("我是子类静态方法");
    }

}
