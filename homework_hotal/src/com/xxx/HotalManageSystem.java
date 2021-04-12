package com.xxx;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HotalManageSystem {

    public static void main(String[] args) {
        Building b1 = new Building();
        while (true) {
            System.out.println("--------------酒店房间管理系统-----------------");
            //     Scanner roomNum =new Scanner(System.in);
            ///     System.out.println("订购了："+roomNum.nextInt()+"号房间");
//        Room room=new Room(101,"lcx",false);
//        Room room2 =new Room(11123,"lcx",false);
//
//        System.out.println(room.equals(room2));


            System.out.println("输入功能编号：1.查看房间列表。2.订房编号。 3.退房编号。0.退出系统");
            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            if (i == 1) {
                b1.checkAll();
            }
            if (i == 2) {
                System.out.println("输入订房编号：");
                Scanner o = new Scanner(System.in);
                b1.order(o.nextInt());
                System.out.println(o.nextInt()+"订房成功");
            }
            if (i == 3) {
                System.out.println("输入退房编号：");
                Scanner o = new Scanner(System.in);
                b1.exitRoom(o.nextInt());
                System.out.println(o.nextInt()+"退房成功");
            }
            if (i == 0) {
                System.out.println("exit System");
              return;
            }
        }
    }
}
class Room{

    private int num;
    private String type;
    private boolean status;

    public Room(int num) {
        this.num = num;
    }
    public Room() {

    }


    public Room(int num, String type, boolean status) {
        this.num = num;
        this.type = type;
        this.status = status;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {

       if(o==null || !(o instanceof Room) ) return false;
       if(this==o) return true;
       Room classroom= (Room) o;
       //房间编号一样代表 相同
        System.out.println(this.getNum());
        System.out.println(classroom.getNum());
       return this.getNum()== classroom.getNum();


    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "num=" + num +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }

}