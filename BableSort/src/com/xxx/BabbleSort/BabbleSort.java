package com.xxx.BabbleSort;

public class BabbleSort {
    public static void main(String[] args) {
        int[] a={1,1,56,3,6,6,9};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a.length-1-i;k++)
            {
                temp=a[k];
                if(a[k]<a[k+1])
                {
                     a[k]=a[k+1];
                    a[k+1]=temp;
                }

            }
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
