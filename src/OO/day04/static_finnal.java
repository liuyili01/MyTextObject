package OO.day04;

//全局变量
class pi{
    public static final double PI=3.1415926;
}
public class static_finnal {
    public double zhouchang(int a){
        double b;
        b=a*pi.PI;//同类名访问
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        static_finnal sf=new static_finnal();
        sf.zhouchang(6);
    }

}
