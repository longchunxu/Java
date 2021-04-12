public class Super {
    public static void main(String[] args) {
        new B();

    }
}
class A {
    private int i;
    private int j;

    A(){
        System.out.println("father A constractor");
    }

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
class B extends A{

    public int k;

    B(){
        //super() 必须卸载构造函数的第一行 默认会有一个构造方法 但是没有显示出来 创建子类时 会先调用父亲的构造方法
       // super(1);

        System.out.println("son  B constractor");
    }
    B(int i,int j,int k){
        super(i,j);//因为 i j在父类中时private修饰 子类不能访问 所以采用super（）调用父类的构造函数 进行变量的赋值
        this.k=k;
    }
}