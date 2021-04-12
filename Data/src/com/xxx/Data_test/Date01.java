package com.xxx.Data_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();//获取系统当前时间
        System.out.println(date);
        /**SimpleDateFormat 时间格式化
         *simpleDateFormat.format(date)
         */
//        Date转String
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");//SimpleDateFormat 格式化日期
        System.out.println(simpleDateFormat.format(date));
//      String转Date
        String date1="2020-08-08 20:20:30";//date1和simpleDateFormat1日期格式必须相同 否则转换异常
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date data3=simpleDateFormat1.parse(date1);
        System.out.println(data3);
    }
}
