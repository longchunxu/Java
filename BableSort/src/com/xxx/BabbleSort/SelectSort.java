package com.xxx.BabbleSort;

public class SelectSort {
    public static void main(String[] args) {
        int[] a={6,4,57,23};
        for(int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++)
            {
                int min=i;//每次排序会排好一个，第一个要排的元素为数组下标为i的值，当做数组中最小的一个 来和其他元素比较。
                if(a[j]<a[min]){
                    min=j;//当最小值大于数组中的元素值后  交换最小的值的下标

                }
                if(min!=i)
                {
                    int temp;
                    temp=a[min];
                    a[min]=a[i];
                    a[i]=temp;
                }


            }

        }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
