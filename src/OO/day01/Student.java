package OO.day01;
//测试类才会加main
//模板类中无需加类
 class Studentz {
    String name;
    int age;//全局变量
    int stuID;
    void stuady(){
        int a=20;//局部变量
        System.out.println(name+"在学学习");
    }
    Studentz(String name ,int age,int stuID ){
        this.name=name;
        this.age=age; //java规定局部变量和成员变量的名字是可以重名的，在使用变量时，遵循就近原则。
        //this表示当前对象。
        this.stuID=stuID; //构造方法（函数）！！！！！
    }
    void sayHello(){

        System.out.println("大家好我叫"+name+"今年"+age+"岁了，我的学号是"+stuID);
    }
}
 public class Student{
    public static void main(String[] args) {
        Studentz stu = new Studentz("张三san ",50,563);
        Studentz stu2=new Studentz("李四",88,963);
        Studentz stu3=new Studentz("隔壁老王",06,285);

        stu.stuady();
        stu.sayHello();
        stu2.sayHello();
        stu2.stuady();;
        stu3.stuady();
        stu.sayHello();
    }
}





