package OO.day07;

public class ClassCasTdemo {
    public static void main(String[] args) {
        Father f=new Boo1();
        Boo1 b=(Boo1)f;//强制类型转换 Father转Boo1类型
        inteface it=(inteface) f;//强制类型转换 强制转换成inteface
//        coo c=(inteface)f;//强制类型转换失败
        if(f instanceof  coo){ //判断数据类型
//            可以判断是否可以强制转换类型


        }
    }
}
 class Father{

 }
 interface inteface{

 }
 class Boo1 extends Father implements inteface{

 }
 class coo extends Father{

 }