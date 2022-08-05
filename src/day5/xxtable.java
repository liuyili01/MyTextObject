package day5;

public class xxtable {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                if(i>=j) {
                    int sum = i * j;
                    System.out.print(i + " * " + j + " = " + sum+"   ");
                }
            }//99乘法表
            System.out.println("");
        }
        int [] arr={50,90,30,100,60000,800};
        int max=arr[0];
        int h=0;
        for(int i=0;i<arr.length;i++){

            if (max<arr[i]){
                h=max;
                max=arr[i];
                arr[i]=h;

            }
        }
        System.out.println(max);
    }
}
