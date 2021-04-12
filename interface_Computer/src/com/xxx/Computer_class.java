package com.xxx;

public class Computer_class {
    private int price;
    InsertDraeable Insert;
    Computer_class(){

    }
    Computer_class(InsertDraeable Insert){
        this.Insert=Insert;//初始化成员变量 Insert  否则空指针异常NullPointerException

    }
}
