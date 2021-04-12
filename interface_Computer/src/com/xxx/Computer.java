package com.xxx;

import java.lang.reflect.Array;

/**访问控制修饰符   本类     同包         子类         任意位置
 * pubnlic        可以     可以          可以        可以
 * protected      可以     可以          可以        不可以
 * 默认           可以     可以           不可以      不可以
 * private        可以     不可以         不可以      不可以
  */
public class Computer {
    public static void main(String[] args) {

        Mouse m=new Mouse();
        Computer_class c=new Computer_class(m);
        c.Insert.print();
        Keyboard k=new Keyboard();
        Computer_class c2=new Computer_class(k);
        c2.Insert.print();


    }

}
interface InsertDraeable{

    public abstract void print();
}


