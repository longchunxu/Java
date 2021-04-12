package com.xxx;

import java.util.Arrays;

public class Building{
    Room room[][]=new Room[3][10];//三层楼 每楼10个房间

    public Building() {
        for(int i=0;i<room.length;i++)
        {
            for(int j=0;j<room[i].length;j++){
                if(i==0)
                    room[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                if(i==1)
                    room[i][j]=new Room((i+1)*100+j+1,"双人间",true);
                if(i==2)
                    room[i][j]=new Room((i+1)*100+j+1,"套房",true);
            }
        }

    }
    public void checkAll(){
        for(int i=0;i<room.length;i++)
        {
            for(int j=0;j<room[i].length;j++){
                System.out.println(room[i][j].toString());
            }
            System.out.println(" ");
        }

    }
    public void order(int num){
//    if( o instanceof Object) {
//        Room o1=(Room)o;
//        o1.setStatus(false);
//
//    }
        int i,j,k;
        i=num/100;
        j=num/10%10;
        k=num%10;

        room[i-1][k-1].setStatus(false);



    }
public void exitRoom(int num){
    int i,j,k;
    i=num/100;
    j=num/10%10;
    k=num%10;

    room[i-1][k-1].setStatus(true);

}

}
