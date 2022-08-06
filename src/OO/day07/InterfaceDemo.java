package OO.day07;
//接口的使用演示类“：
public class InterfaceDemo {
    public static void main(String[] args) {
    Inter1 i =new Inter1() {
        @Override
        public void text() {
        System.out.println("接口的匿名内部类");
        }
    };
    }
}
interface Inter1{//接口 Inter1 接口不能被实例化对象 接口可以用匿名内部类

    int I=10;//默认为公开常量
//    void text(){} 不能使用普通方法，必须为抽象方法
    void text();//默认为抽象方法
}
class Aoo{

}
class Boo extends Aoo implements Inter1{

  public void text(){

  }
}
