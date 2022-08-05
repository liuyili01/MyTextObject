package Text2;

public class day7_12 {
    public static void main(String[] args) {
        double i=7D/2; //如果未改变7的数据类型，则7位int型
        long a=10000000000000000L;
        long b=10000000000L*2*20L;
        long c=1000000000*3*20L;  //数据溢出

        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        double p=2.09;
        double q=3;
        System.out.println(q-p); //存在误差
        boolean a1=false;
        boolean c1=true;
        char varchar='a';
        char varchar2='\\'; //存储特殊符号需要转义
        System.out.println(varchar);
        System.out.println(varchar2);
    }
}
