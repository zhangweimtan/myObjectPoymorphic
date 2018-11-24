package com.myjava01;
/*
    多态的优缺点：
        优点：继承的优点，就是多态的优点，提高可维护性；提高代码的可扩展性
        缺点：无法直接访问子类特有成员，
 */
public class Demo4 {
    public static void main(String[] args) {
        MiFactory factory = new MiFactory();
        factory.manufactureMi(new MiNote());//匿名类
        factory.manufactureMi(new Redmi());
    }
}

class MiFactory {
    public void manufactureMi(Phone p){
        p.call();
    }
}
// 接口
interface Phone{
    public abstract void call();
}
//小米Note
class MiNote implements Phone{
    public void call(){
        System.out.println("小米Note打电话");
    }
}
//红米
class Redmi implements Phone{
    public void call(){
        System.out.println("红米手机打电话");
    }
}