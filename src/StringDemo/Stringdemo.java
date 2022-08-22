package StringDemo;
//字符串的使用演示类
public class Stringdemo {
    public static void main(String[] args) {
        String a="123"; //声明的值为常量
        String b=a;
        a="456";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);//判断地址是否相同，false
        int a1=100;
        int a2=100;
        System.out.println(a1==a2);//判断值是否相同
        String aa="1234";
        String bb="1234";
        System.out.println(aa==bb);//bb实现了对aa已声明的地址的复用
        String e=new String("1234");
        System.out.println(aa==e);//false地址不同
        String f="1";
        String d="1"+"234";
        String g=f+"234";
        System.out.println(aa==g);//动态新建了地址false
        System.out.println(aa==d);//依旧使用之前的常量true
        //判断字符串类型是否相等
        System.out.println(a.equals(g));//判断的是内容，而不是地址
    }
}
