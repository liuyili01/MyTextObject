package day5;

import java.util.Scanner;

public class void_text {
    public static void main(String[] args) {
        System.out.println("输入数字");
        Scanner s=new Scanner(System.in);
        int scan=s.nextInt();
        int sca=s.nextInt();

        //无参数无返回值方法,往往都是来封装一段重复的业务逻辑时使用的形式
        srt();//类方法的调用
        srt();//类方法的重复调用
        srt();//类方法的重复调用
        srt();//类方法的重复调用
        srt();//类方法的重复调用


        str(scan,sca);
        System.out.println(scan+"   "+sca);
//        s.close();
        System.out.println("输入显示数据类型");
        int ax=s.nextInt();
        cfd(ax);

    }
     public static void srt(){
        int a=0;
        int b=1;
        System.out.println(a+b);

    }
    public  static int  str(int x,int y){  //int表示返回值类型，void表示无返回值


        x=(y%x)*x+y;
        System.out.println(x);
        return x;
    }
    public  static void cfd(int a ){
        System.out.println("该数据为整型");

    }
    public  static void cfd(float a ){
        System.out.println("该数据为浮点型");

    }
    public  static void cfd(double a ){
        System.out.println("该数据为double型");

    }
    public  static void cfd(boolean a ){
        System.out.println("该数据为布尔型");

    }

}
