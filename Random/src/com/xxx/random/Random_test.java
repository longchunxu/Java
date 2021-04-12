package com.xxx.random;

import java.util.Random;

public class Random_test {


    public static void main(String[] args) {
        Random random = new Random();//产生一个int范围内的随机数
        //  int a= random.nextInt(10);//产生10以内的随机数
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = -1;
            //   n[i]=random.nextInt(5);//产生的随机数赋值到数组中
        }

        int index = 0;
        while (index < n.length) {
            int a = random.nextInt(5);

            System.out.println("a的取值数："+a);
            if (!contain(n,a)) {
                n[index] = a;
                index++;

            }




        }

        for (int i = 0; i < n.length; i++)
            System.out.println(n[i]);


    }
    public static boolean contain(int[] arr, int key){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return true;

        }

        return false;
    }
}


