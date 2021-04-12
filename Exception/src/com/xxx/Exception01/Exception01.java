package com.xxx.Exception01;

/**
 * 异常机制
 * 执行程序出现异常的时候=异常
 * 异常在java中以类存在  可以手动new异常出来
 */
public class Exception01 {
    public static void main(String[] args) {
int a=9;
int b=0;
//int c=a/b;
        ArithmeticException  cv =new ArithmeticException("000");
        System.out.println(cv);
    }
}
