package StringDemo;
//StringBuilder使用演示类
public class StringBuilderDemo {
    public static void main(String[] args) {
//        String a="a";
//        long start=System.currentTimeMillis();//获取当前系统时间
//        for (int i = 0; i < 1000000; i++) {
//            a+="a";
//        }
//        long end=System.currentTimeMillis();//获取当前系统时间 单位毫秒
//        System.out.println("运行时间是"+(end-start)+"毫秒");
        //String不适合频繁修改，一旦发生修改就是创建新的对象
        String str="好好学习Java";
        StringBuilder builder=new StringBuilder(str);  //用StringBuilder拼接速度贼快
        //在str字符串中拼接内容
        builder.append(",为了找份好工作");
        //字符串修改
        builder.replace(9,15,"为了改变世界");//改变的区间
//        删除的使用
        builder.delete(9,15);//开始下标，结束下标
//        反转方法
//        builder.reverse(str);
    }
}
