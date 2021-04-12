
/*
 * Copyright(c)2020-2021,
 *    项目名称:homework
 *    文件名称:Mystack.java
 *    Date:2021/2/1 上午10:50
 *    Author:lcx
 */

package com.xxx.homework;

public class Mystack {


    public static void main(String[] args) {

        Stack s1=new Stack();
        Stack s2=new Stack();
        s1.push(s2);
        s1.push(s2);
        s1.push(s2);
        s1.push(s2);
        s1.push(s2);
        s1.push(s2);
        s1.push(s2);
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();

    }
}
class Stack{
    Object o[]=new Object[5];

    public Object[] getO() {
        return o;
    }

    public void setO(Object[] o) {
        this.o = o;
    }

    static int i=0;//栈顶指针
    int a,b;

    Stack(){



    }
public  void push(Object o){
        if (i==this.o.length-1)
        {
            System.out.println("Stack is full");
        }
        else{
            this.o[i]=o;
            System.out.println("Stack +1 栈内元素:"+(i+1)+" ");
                i++;
        }

    }

public void pop(){
        if(o.length-1<0) {
            System.out.println("Stack is  null");
        }
        else {

            if (i > 4)
            {
                i=4;

            }
            if(i<0){
                System.out.println("栈空了");
                return;

            }
            System.out.println("第" + (i + 1) + "个对象呗销毁");
            o[i]=null;
            i--;
            System.gc();//销毁对象

            System.out.println("栈内元素还有："+(i+1)+"个");



        }

}
}