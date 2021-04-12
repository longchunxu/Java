package com.xxx.interafce;

public class Interface1 {
    public static void main(String[] args) {
       A a=new All();//多态 父引用指向子类的空间 调用的子类方法 降低耦合度
       a.sum();
       B b=(B)a;//向下转型
       b.decrese();
/**
 * 接口没有父子关系也可以强制转换  编译没问题，但是运行的时候可能会出现ClassCastException
 * 无论向上转型 和向下转型 两种类型之间要有继承关系（接口不适用）
 * 向下转型之前用 intanceof 判断
 */
       C c=new A2();
       D d=(D)c;//ClassCastException

    }
}
interface A{
    public abstract void sum();

}
interface B{
    void decrese();

}
class All implements A,B{
     public All(){

    }
    public  void  decrese(){
        System.out.println("decrese");
    }
    @Override
    public void sum() {
        System.out.println("sum");
    }
}

interface C{

}
interface D{

}
class A2 implements C{

}