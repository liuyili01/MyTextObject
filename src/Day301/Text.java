package Day301;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        int a=5;
        int b=20;
        System.out.println(a<b&&++b>a);
        System.out.println(b);
        System.out.println(10+10+30+"1");
        System.out.println("1"+10+10+30);
        byte c=5;
        c+=5; //使用扩展赋值号时，系统会自动进行强转 c= (byte)(c+5);
//        c=c+5;
        // 编译错误：小类型+大类型 系统会自动将其结果转换为大类型
//        c=?
        System.out.println(c);
        //作业
        Scanner s=new Scanner(System.in);
        int scan=s.nextInt();
        System.out.println("请输入");
        switch (scan){
            case 1:
                System.out.println("剪刀");
                break;
            case 2:
                System.out.println("石头");
                break;
            case 3:
                System.out.println("布");
                break;

        }




        int [] arr={1,100,88,19,0,10,55,23,4,5};
        int h=0;
        int j=0;
        int k=0;
        for (int i=0;i<arr.length;i++){
            for (j=0;j<arr.length;j++){
                if (arr[j]<arr[i]){
                    h=arr[j];
                    arr[j]=arr[i];
                    arr[i]=h;
    //快速排序
                }
            }

        }
        for(int d:arr)
        System.out.println(d);
      int   cd =(int)(Math.random()*40);
        System.out.println(cd);
    }
}
