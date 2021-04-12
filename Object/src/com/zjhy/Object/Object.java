package com.zjhy.Object;

/**1.toString()
 * public String toString() {
 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * }
 * toString()  每一个类自带的方法  sun公司建议每个子类重写这个方法(都是要重写的)
 * toString() 应该是一个简洁的、详实的、易阅读的
 * * 如果不重写 输出 类名+hash地址
 */

import java.util.Objects;

/**2. equal（）
 *  public boolean equals(Object obj) {
 *         return (this == obj);
 *         判读两个对象是否相等
 *
 */
public class Object {
    public static void main(String[] args) {
        father f=new father("lcx","lcxfemale");
        String name= f.toString();
        System.out.println("1:"+name);
        System.out.println("2:"+f);//输出对象时  默调用toString（）
        /*---------*/
        father f1=new father("lcx1","lcxfemale1");
        father f2 =new father("lcx1","lcxfemale1");
        System.out.println(f1.equals(f2));

    }

}
class father{
    String son;
    String daughter;
    father(String son,String daughter){
        this.son=son;
        this.daughter=daughter;

    }

  public String toString(){
        //返回结果尽量简洁
      return "儿子："+this.son+" 女儿："+this.daughter;

  }

    //判断对象里的内容是否相同  重写类里的equals 方法


    @Override
    public boolean equals(java.lang.Object obj) {//java.lang.Object obj  传一个子类的实例 父类型引用指向这个实例
        if(obj instanceof father)//判断obj的引用是否指向father实例 是才可以向下转型
        {
            father f3=(father) obj;
            if (this.son==f3.son&&this.daughter==f3.daughter){
                return true;

            }

            else
                return false;
        }
        else
            return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(son, daughter);
    }



}
