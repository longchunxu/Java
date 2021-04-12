package com.xxx.Array01;

/**
 * Array引用数据类型  存在堆  存基本数据类型或者引用数据类型
 * 数组存储的java 对象的话  存的是内存地址  长度定义以后 不可变  数据类型必须统一
 */
public class Array01 {
    public static void main(String[] args) {
       int [][] arry={{1,2},
            {3,4,6,8},
            {5,6,32,66}
        };
       for (int i=0;i<arry.length;i++)
       {
           for (int j=0;j<arry[i].length;j++)
           {
               System.out.print("arry["+i+"]["+j+"]="+arry[i][j]+" ");
             //  System.out.println(arry[i][j]);
           }
           System.out.println();
       }
        System.out.println(" -----------九九乘法表 start-------------");
       for (int m=1;m<=9;m++)
       {
           for (int n=1;n<=m;n++)
           {
               System.out.print(" | "+n+"x"+m+"="+m*n+" | ");
           }
           System.out.println();
       }
        System.out.println(" -----------九九乘法表 over-------------");
        }

    }

