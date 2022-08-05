package OO.day02;


public class Doctor extends Person {
    int level = 52;

    Doctor(int age, String name, char sex) {
        super(45, "王医生", '男');
    }

    void cut() {

    }
    @Override
    void sayHi(){  //重写
        System.out.println(name+age+sex+"医生");
    }
}


