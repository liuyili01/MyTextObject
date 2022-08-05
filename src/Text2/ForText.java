package Text2;

import sun.text.normalizer.UCharacter;

import java.util.Scanner;

public class ForText {

    public static void main(String[] args) {

        int  i=(int)(Math.floor(Math.random()*10)) ;
        Scanner scan=new Scanner(System.in);

//            int j; //作用域的作用
//        do {
//            System.out.println("请输入数据");
//             j=scan.nextInt(); //作用域的作用
//            if(i>j) {
//
//                System.out.println("猜小了");
//            }
//            else if (i==j) {
//                System.out.println("猜对了");
//            }else {
//                System.out.println("猜大了");
//            };
//        } while (i!=j);
        for (int p=0;p<10;p++){
            if (p%2==0){
                System.out.println(p+"是偶数");
                continue;  //跳出当前循环，进入下次循环
            } else {
                System.out.println(p+"是奇数");
            }

        }


    }

}
