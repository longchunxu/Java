package com.xxx.finalize;

/*
finalize() 对象被销毁时  gc垃圾回收会自动调用这个方法
 */
public class Finalize {
    public static void main(String[] args) {
        int j=0;
        for (int i=0;i<999000;i++) {
            P p=new P();
            p=null;
            System.gc();
            System.out.println("对象建立id："+i);
        }

    }
}
class P{
    static int i=0;

    @Override
    protected void finalize() throws Throwable {
        i=i+1;
        System.out.println(this+"被销毁了 "+1);
    }
}