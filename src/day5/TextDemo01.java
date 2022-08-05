package day5;

import java.util.Scanner;

public class TextDemo01 {
    public static void main(String[] args) {
        int [] str={1,5,8,9,6,2,3,8,5};
        int sum=0;
        for (int i=0;i<str.length;i++){

            sum+=str[i];
        }
//        System.out.println("输入数组");
//        System.out.println(sum);
//        Scanner s=new Scanner(System.in);
//         int sc=s.nextInt();
         System.out.println(getFactoral(3));
        System.out.println(getNumeall(123));
        woterflower();


//        System.out.println(sum1(str));

    }


    public static int sum1(int [] arr) {
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;

    }
    public static int getFactoral(int a){
        int sum2 =1;
        for (int i=1;i<=a;i++){
            sum2 *=i;
        }
        return  sum2;
    }
    public  static  int getNumeall(int a){
        int b=0;
        int sum=0;
        for ( int i=0;i<3;i++){
            b=a%10;
            a/=10;
            sum+=b;

        }
        return sum;
    }
    public static void woterflower() {
        int b=0;
        int c=0; //水仙花数
        int d=0;
        int sum=0;
        for(int i=100;i<1000;i++){
            b=i%10;
            c=i/10%10;
            d=i/100;

            if(Math.pow(b,3)+Math.pow(c,3)+Math.pow(d,3)==i){
                System.out.println(i);
                System.out.println("这个数是水仙花数");

            }
        }






    }
}
