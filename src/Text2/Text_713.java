package Text2;

import java.util.Scanner;

public class Text_713 {
    public static void main(String[] args) {
        int count=0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int x=(int)(Math.floor(Math.random()*100));
            int y=(int)(Math.floor(Math.random()*100));

            System.out.println("请计算");
            System.out.println(x+"+"+y+"="+"?");
            int  sh=s.nextInt();
            int sum=x+y;
            if (sum==sh){
                count++;
                System.out.println("答对了");


            };

        };
        System.out.println("您算对"+count+"道题"+"总计："+count*10+"分");
    }

}
