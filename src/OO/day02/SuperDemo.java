package OO.day02;
//继承构造方法的使用演示类
public class SuperDemo {
    public static void main(String[] args) {
        B b=new B();

    }
}
class A{
    A(int a){
        System.out.println("这是A"+a);
    }
}
class B extends A{
    B(){
        super(10);//相当于调用父类的无参构造方法 默认存在
        System.out.println("这是B");
    }
}