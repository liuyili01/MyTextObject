package OO.day02;

public class Student extends  Person {  //继承Person类
     Student(int age,String name,char sex){
         super(age,name,sex );
     }
    void sayHi(){
        System.out.println(name+age +sex+"学生");
    }
}
