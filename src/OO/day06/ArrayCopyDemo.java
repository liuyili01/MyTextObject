package OO.day06;

import java.util.Arrays; //引入数组扩容

//数组扩容
public class ArrayCopyDemo {

    public static void main(String[] args) {
        int [] arr={};//未定义空间
        int a=10;
        int b=2;
        arr=Arrays.copyOf(arr,arr.length+1);//对arr数组进行复制扩容
        arr[arr.length-1]=a;
       arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=b;
        //数组拷贝
        int[] arr1={1,2,3,5,6};
        int[] arr2={10,20,30,40,50};
        System.arraycopy(arr1,0,arr2,0,arr1.length);//参数：拷贝的源数组，源数组开始下标，要拷贝目标数组，目标数组的开始下标，拷贝数量
//1全部拷贝到2中

    }
}
