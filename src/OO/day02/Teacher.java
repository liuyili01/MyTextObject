package OO.day02;

public class Teacher  extends Person{ //继承person类的属性和方法
    Teacher(int age,String name,char sex){
        super(age,name,sex);
    }
    void teach(){

    }

    void sayHi(){   //重写
            System.out.println(name+"今年"+age+"老师"+sex);
        }
    void salary(){

    }
}
