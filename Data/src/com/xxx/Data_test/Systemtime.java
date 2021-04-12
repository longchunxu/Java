package com.xxx.Data_test;

public class Systemtime {
    public static void main(String[] args) {
        //从1970 1.1 00:0到当前时间的毫秒数
        long time=System.currentTimeMillis();

        for(int i=0;i<1000;i++){
                 System.out.println("1"+i);
        }

        long time2=System.currentTimeMillis();

        long Worktime=time2-time;
        System.out.println("耗费时长："+Worktime);
    }

    //统计方法运行 时长
    
    
}
