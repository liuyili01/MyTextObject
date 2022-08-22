package JavaText1.text;

import java.util.Arrays;

public class maopaopaixu {
    public static void main(String[] args) {
        int[] a={10,8,9,21,30,5,2,4,23,90,12,42};
        for(int i=0;i<a.length-1;i++){
            for (int j = 0; j < a.length-1-i; j++) {

                if(a[j]>a[j+1]){
                    int b=0;
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
  
}
