package OO.day02;



public class ExtendsDemo {
    public static void main(String[] args) {
//        如何为对象快速赋值

//            Student[] student=new Student[4];//创建数组对象
//            student[0]=new Student(20,"小明",'男');
//            for (int i = 0; i <student.length ; i++) {
//
//            }
            Person[] pp=new Person[4];//数组长度3,012.
            pp[1]=new Student(2,"gh",'f');
            pp[2]=new Student(2,"gh",'f');
            pp[0]=new Teacher(1,"sdsdfsd",'7');//向上造型
            pp[1].sayHi();
            pp[0].sayHi();//方法的重写
            pp[3]=new Doctor(2,"51",'4');
            pp[3].sayHi();
            //重写的方法必须与父类方法原型保持一致：修饰符，返回值类型，方法，名（参数列表）完全要一致


//        Student student=new Student();
//        student.name="小明"; //继承测试
//        student.study();
//        Teacher teacher=new Teacher();
//        teacher.name="王老师";
//        teacher.age=52; //继承赋值属性
//        teacher.sayHi();//继承调用方法
//        Person person=new Person();
//        person.name="人类"; //父类依然可以调用自己的属性方法
////        person.sayHi(); 无法调用子类的方法
}
}

