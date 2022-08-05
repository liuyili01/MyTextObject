package OO.day05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextDemo {
    public static void main(String[] args) {
        Superclass s1 =new Superclass(){
            public void show(){
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//                String a=reader.readLine();
                System.out.println("通过内部类");//匿名内部类
            }
        };
        s1.show();

    }
}
class  Superclass{
    public void show(){

    }
}
class s{

}
