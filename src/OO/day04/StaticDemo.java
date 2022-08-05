package OO.day04;

public class StaticDemo {
    public static void main(String[] args) {
        aoo a1=new aoo();
        a1.print();

        aoo a2=new aoo();
        a2.print();
        aoo a3=new aoo();


        a3.print();
    }
}
class aoo{
    public  int a;//实例变量，属于对象的
    public static  int b;//静态变量，属于类的
    aoo(){
        a++;
        b++;
    }
    public void print(){
        System.out.println(a+"    "+b);
    }

}
